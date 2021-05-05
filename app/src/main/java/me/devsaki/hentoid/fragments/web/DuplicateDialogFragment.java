package me.devsaki.hentoid.fragments.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.greenrobot.eventbus.EventBus;

import me.devsaki.hentoid.R;
import me.devsaki.hentoid.core.HentoidApp;
import me.devsaki.hentoid.database.CollectionDAO;
import me.devsaki.hentoid.database.ObjectBoxDAO;
import me.devsaki.hentoid.database.domains.Content;
import me.devsaki.hentoid.database.domains.ImageFile;
import me.devsaki.hentoid.databinding.DialogWebDuplicateBinding;
import me.devsaki.hentoid.util.ThemeHelper;

import static me.devsaki.hentoid.util.ImageHelper.tintBitmap;

public final class DuplicateDialogFragment extends DialogFragment {

    private static final String KEY_CONTENT_ID = "contentId";
    private DialogWebDuplicateBinding binding = null;

    private static final RequestOptions glideRequestOptions;

    static {
        Context context = HentoidApp.getInstance();

        Bitmap bmp = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_hentoid_trans);
        int tintColor = ThemeHelper.getColor(context, R.color.light_gray);
        Drawable d = new BitmapDrawable(context.getResources(), tintBitmap(bmp, tintColor));

        glideRequestOptions = new RequestOptions()
                .centerInside()
                .error(d);
    }

    // === UI

    // === VARIABLES
    private DuplicateDialogFragment.Parent parent;
    private long contentId;


    public static void invoke(
            @NonNull final FragmentActivity parent,
            @NonNull final long contentId) {
        DuplicateDialogFragment fragment = new DuplicateDialogFragment();

        Bundle args = new Bundle();
        args.putLong(KEY_CONTENT_ID, contentId);
        fragment.setArguments(args);

        fragment.show(parent.getSupportFragmentManager(), null);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (null == getArguments()) throw new IllegalArgumentException("No arguments found");
        contentId = getArguments().getLong(KEY_CONTENT_ID);

        parent = (Parent) getActivity();
    }

    @Override
    public void onDestroyView() {
        EventBus.getDefault().unregister(this);
        super.onDestroyView();
        parent = null;
        binding = null;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedState) {
        binding = DialogWebDuplicateBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View rootView, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);

        Content content = loadContent();

        binding.tvTitle.setText(content.getTitle());
        ImageFile cover = content.getCover();
        String thumbLocation = cover.getUsableUri();
        if (thumbLocation.isEmpty()) {
            binding.ivCover.setVisibility(View.INVISIBLE);
            return;
        }

        binding.ivCover.setVisibility(View.VISIBLE);
        if (thumbLocation.startsWith("http"))
            Glide.with(binding.ivCover)
                    .load(thumbLocation)
                    .apply(glideRequestOptions)
                    .into(binding.ivCover);
        else
            Glide.with(binding.ivCover)
                    .load(Uri.parse(thumbLocation))
                    .apply(glideRequestOptions)
                    .into(binding.ivCover);
    }

    private Content loadContent() {
        CollectionDAO dao = new ObjectBoxDAO(requireContext());
        try {
            return dao.selectContent(contentId);
        } finally {
            dao.cleanup();
        }
    }


    public interface Parent {
        void onDownloadDuplicate();
    }
}
