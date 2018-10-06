package me.devsaki.hentoid.services;

import android.app.ActivityManager;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.Volley;
import com.crashlytics.android.Crashlytics;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.devsaki.hentoid.util.Helper;
import me.devsaki.hentoid.util.Preferences;
import me.devsaki.hentoid.util.VolleyOkHttp3Stack;
import timber.log.Timber;

/**
 * Created by Robb_w on 2018/04
 * Manager class for image download queue (Volley)
 *
 * NB : Class looks like a singleton but isn't really once, since it is reinstanciated everytime forceSlowMode changes
 */
public class RequestQueueManager<T> implements RequestQueue.RequestFinishedListener<T> {
    private static RequestQueueManager mInstance;           // Instance of the singleton
    private static Boolean allowParallelDownloads = null;       // True if current instance has anti-parallel mode on
    private static final int TIMEOUT_MS = 15000;

    private RequestQueue mRequestQueue;                     // Volley download request queue
    private int nbRequests = 0;                             // Number of requests currently in the queue (for debug display)

    // Anti-parallel downloads management
    private Map<String, List<Request<T>>> serverRequests;  // Stores requests for all servers to be handed down to Volley during anti-parallel mode


    private RequestQueueManager(Context context, boolean allowParallelDownloads) {
        RequestQueueManager.allowParallelDownloads = allowParallelDownloads;
        if (!allowParallelDownloads) serverRequests = new HashMap<>();

        int nbDlThreads = Preferences.getDownloadThreadCount();
        if (nbDlThreads == Preferences.Constant.DOWNLOAD_THREAD_COUNT_AUTO) {
            nbDlThreads = getSuggestedThreadCount(context);
        }
        Crashlytics.setInt("Download thread count", nbDlThreads);

        mRequestQueue = getRequestQueue(context, nbDlThreads);
    }

    private int getSuggestedThreadCount(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager == null) return 4;

        int memoryClass = activityManager.getMemoryClass();
        Crashlytics.setInt("Memory class", memoryClass);

        if (memoryClass <= 64) {
            return 1;
        } else if (memoryClass <= 96) {
            return 2;
        } else if (memoryClass <= 128) {
            return 3;
        } else {
            return 4;
        }
    }

    public static synchronized <T> RequestQueueManager<T> getInstance() {
        return getInstance(null, true);
    }

    @SuppressWarnings("unchecked")
    public static synchronized <T> RequestQueueManager<T> getInstance(Context context, boolean allowParallelDownloads) {
        if (context != null && (mInstance == null || (null == RequestQueueManager.allowParallelDownloads || RequestQueueManager.allowParallelDownloads != allowParallelDownloads))) {
            mInstance = new RequestQueueManager<T>(context, allowParallelDownloads);
        }
        return mInstance;
    }

    /**
     * Returns the app's Volley request queue
     *
     * @param ctx App context
     * @return Hentoid Volley request queue
     */
    private RequestQueue getRequestQueue(Context ctx) { // This is the safest code, as it relies on standard Volley interface
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(ctx.getApplicationContext(), new VolleyOkHttp3Stack(TIMEOUT_MS));
            mRequestQueue.addRequestFinishedListener(this);
        }
        return mRequestQueue;
    }

    private RequestQueue getRequestQueue(Context ctx, int nbDlThreads) { // Freely inspired by inner workings of Volley.java and RequestQueue.java; to be watched closely as Volley evolves
        if (mRequestQueue == null) {
            BasicNetwork network = new BasicNetwork(new VolleyOkHttp3Stack(TIMEOUT_MS));

            File cacheDir = new File(ctx.getCacheDir(), "volley"); // NB : this is dirty, as this value is supposed to be private in Volley.java
            mRequestQueue = new RequestQueue(new DiskBasedCache(cacheDir), network, nbDlThreads);
            mRequestQueue.addRequestFinishedListener(this);
            mRequestQueue.start();
        }
        return mRequestQueue;
    }

    /**
     * Add a request to the app's queue
     *
     * @param request Request to add to the queue
     */
    void queueRequest(Request<T> request) {
        if (!allowParallelDownloads) {
            String host = Helper.getHostFromUrl(request.getUrl());
            List<Request<T>> requests;
            if (serverRequests.containsKey(host))
            {
                requests = serverRequests.get(host);
                requests.add(request); // Will wait until the 1st of the list has been completed
                Timber.d("Host %s queue ::: request added - current total %s", host, requests.size());
                return;
            } else {
                requests = new ArrayList<>();
                serverRequests.put(host, requests);
                // 1st request of any server is directly feeded to the global request queue
                // hence it is not added to the requests list
            }
        }
        addToRequestQueue(request);
    }

    private void addToRequestQueue(Request<T> request) {
        mRequestQueue.add(request);
        nbRequests++;
        Timber.d("Global requests queue ::: request added for host %s - current total %s", Helper.getHostFromUrl(request.getUrl()), nbRequests);
    }

    /**
     * Generic handler called when a request is completed
     *
     * @param request Completed request
     */
    public void onRequestFinished(Request<T> request) {
        nbRequests--;
        Timber.d("Global requests queue ::: request removed for host %s - current total %s", Helper.getHostFromUrl(request.getUrl()), nbRequests);

        if (!allowParallelDownloads) {
            // Feed the next request of the same server to the global queue
            String host = Helper.getHostFromUrl(request.getUrl());
            if (serverRequests.containsKey(host)) {
                int hostQueueSize = serverRequests.get(host).size();
                if (hostQueueSize > 0)
                {
                    Request<T> req = serverRequests.get(host).get(0);
                    addToRequestQueue(req);
                    serverRequests.get(host).remove(req);
                    hostQueueSize--;
                }
                if (0 == hostQueueSize) serverRequests.remove(host);
            }
        }
    }

    /**
     * Cancel the app's request queue : cancel all requests remaining in the queue
     */
    void cancelQueue() {
        RequestQueue.RequestFilter filterForAll = request -> true;
        mRequestQueue.cancelAll(filterForAll);
        Timber.d("RequestQueue ::: canceled");
    }
}
