// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class DialogMetaRenameBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton actionButton;

  @NonNull
  public final SwitchMaterial mergeDeleteSwitch;

  @NonNull
  public final TextInputLayout name;

  private DialogMetaRenameBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton actionButton, @NonNull SwitchMaterial mergeDeleteSwitch,
      @NonNull TextInputLayout name) {
    this.rootView = rootView;
    this.actionButton = actionButton;
    this.mergeDeleteSwitch = mergeDeleteSwitch;
    this.name = name;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogMetaRenameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogMetaRenameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_meta_rename, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogMetaRenameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_button;
      MaterialButton actionButton = ViewBindings.findChildViewById(rootView, id);
      if (actionButton == null) {
        break missingId;
      }

      id = R.id.merge_delete_switch;
      SwitchMaterial mergeDeleteSwitch = ViewBindings.findChildViewById(rootView, id);
      if (mergeDeleteSwitch == null) {
        break missingId;
      }

      id = R.id.name;
      TextInputLayout name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      return new DialogMetaRenameBinding((ConstraintLayout) rootView, actionButton,
          mergeDeleteSwitch, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
