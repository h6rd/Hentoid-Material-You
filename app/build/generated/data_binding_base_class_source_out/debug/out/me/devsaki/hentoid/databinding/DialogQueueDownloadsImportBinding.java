// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class DialogQueueDownloadsImportBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView importFileInvalidText;

  @NonNull
  public final TextView importFileValidText;

  @NonNull
  public final ProgressBar importProgressBar;

  @NonNull
  public final TextView importProgressText;

  @NonNull
  public final MaterialButton importRunBtn;

  @NonNull
  public final TextView importSelectFileBtn;

  @NonNull
  public final SwitchMaterial importStreamed;

  @NonNull
  public final TextView title;

  private DialogQueueDownloadsImportBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView importFileInvalidText, @NonNull TextView importFileValidText,
      @NonNull ProgressBar importProgressBar, @NonNull TextView importProgressText,
      @NonNull MaterialButton importRunBtn, @NonNull TextView importSelectFileBtn,
      @NonNull SwitchMaterial importStreamed, @NonNull TextView title) {
    this.rootView = rootView;
    this.importFileInvalidText = importFileInvalidText;
    this.importFileValidText = importFileValidText;
    this.importProgressBar = importProgressBar;
    this.importProgressText = importProgressText;
    this.importRunBtn = importRunBtn;
    this.importSelectFileBtn = importSelectFileBtn;
    this.importStreamed = importStreamed;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogQueueDownloadsImportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogQueueDownloadsImportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_queue_downloads_import, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogQueueDownloadsImportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.import_file_invalid_text;
      TextView importFileInvalidText = ViewBindings.findChildViewById(rootView, id);
      if (importFileInvalidText == null) {
        break missingId;
      }

      id = R.id.import_file_valid_text;
      TextView importFileValidText = ViewBindings.findChildViewById(rootView, id);
      if (importFileValidText == null) {
        break missingId;
      }

      id = R.id.import_progress_bar;
      ProgressBar importProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (importProgressBar == null) {
        break missingId;
      }

      id = R.id.import_progress_text;
      TextView importProgressText = ViewBindings.findChildViewById(rootView, id);
      if (importProgressText == null) {
        break missingId;
      }

      id = R.id.import_run_btn;
      MaterialButton importRunBtn = ViewBindings.findChildViewById(rootView, id);
      if (importRunBtn == null) {
        break missingId;
      }

      id = R.id.import_select_file_btn;
      TextView importSelectFileBtn = ViewBindings.findChildViewById(rootView, id);
      if (importSelectFileBtn == null) {
        break missingId;
      }

      id = R.id.import_streamed;
      SwitchMaterial importStreamed = ViewBindings.findChildViewById(rootView, id);
      if (importStreamed == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new DialogQueueDownloadsImportBinding((ConstraintLayout) rootView,
          importFileInvalidText, importFileValidText, importProgressBar, importProgressText,
          importRunBtn, importSelectFileBtn, importStreamed, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
