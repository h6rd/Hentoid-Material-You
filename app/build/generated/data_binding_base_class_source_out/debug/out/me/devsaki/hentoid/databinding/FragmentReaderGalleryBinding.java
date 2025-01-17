// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class FragmentReaderGalleryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout chapterEditHelpBanner;

  @NonNull
  public final TextView chapterEditHelpTxt;

  @NonNull
  public final PowerSpinnerView chapterSelector;

  @NonNull
  public final Barrier horizontalBarrier;

  @NonNull
  public final RecyclerView viewerGalleryRecycler;

  @NonNull
  public final Toolbar viewerGallerySelectionToolbar;

  @NonNull
  public final Toolbar viewerGalleryToolbar;

  private FragmentReaderGalleryBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout chapterEditHelpBanner, @NonNull TextView chapterEditHelpTxt,
      @NonNull PowerSpinnerView chapterSelector, @NonNull Barrier horizontalBarrier,
      @NonNull RecyclerView viewerGalleryRecycler, @NonNull Toolbar viewerGallerySelectionToolbar,
      @NonNull Toolbar viewerGalleryToolbar) {
    this.rootView = rootView;
    this.chapterEditHelpBanner = chapterEditHelpBanner;
    this.chapterEditHelpTxt = chapterEditHelpTxt;
    this.chapterSelector = chapterSelector;
    this.horizontalBarrier = horizontalBarrier;
    this.viewerGalleryRecycler = viewerGalleryRecycler;
    this.viewerGallerySelectionToolbar = viewerGallerySelectionToolbar;
    this.viewerGalleryToolbar = viewerGalleryToolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentReaderGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentReaderGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_reader_gallery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentReaderGalleryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chapter_edit_help_banner;
      ConstraintLayout chapterEditHelpBanner = ViewBindings.findChildViewById(rootView, id);
      if (chapterEditHelpBanner == null) {
        break missingId;
      }

      id = R.id.chapter_edit_help_txt;
      TextView chapterEditHelpTxt = ViewBindings.findChildViewById(rootView, id);
      if (chapterEditHelpTxt == null) {
        break missingId;
      }

      id = R.id.chapter_selector;
      PowerSpinnerView chapterSelector = ViewBindings.findChildViewById(rootView, id);
      if (chapterSelector == null) {
        break missingId;
      }

      id = R.id.horizontal_barrier;
      Barrier horizontalBarrier = ViewBindings.findChildViewById(rootView, id);
      if (horizontalBarrier == null) {
        break missingId;
      }

      id = R.id.viewer_gallery_recycler;
      RecyclerView viewerGalleryRecycler = ViewBindings.findChildViewById(rootView, id);
      if (viewerGalleryRecycler == null) {
        break missingId;
      }

      id = R.id.viewer_gallery_selection_toolbar;
      Toolbar viewerGallerySelectionToolbar = ViewBindings.findChildViewById(rootView, id);
      if (viewerGallerySelectionToolbar == null) {
        break missingId;
      }

      id = R.id.viewer_gallery_toolbar;
      Toolbar viewerGalleryToolbar = ViewBindings.findChildViewById(rootView, id);
      if (viewerGalleryToolbar == null) {
        break missingId;
      }

      return new FragmentReaderGalleryBinding((ConstraintLayout) rootView, chapterEditHelpBanner,
          chapterEditHelpTxt, chapterSelector, horizontalBarrier, viewerGalleryRecycler,
          viewerGallerySelectionToolbar, viewerGalleryToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
