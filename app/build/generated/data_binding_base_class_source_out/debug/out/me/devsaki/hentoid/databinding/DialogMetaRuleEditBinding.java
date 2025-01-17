// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class DialogMetaRuleEditBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton actionEdit;

  @NonNull
  public final MaterialButton actionNew;

  @NonNull
  public final MaterialButton actionRemove;

  @NonNull
  public final ImageView arrowBottom;

  @NonNull
  public final PowerSpinnerView attributeType;

  @NonNull
  public final TextInputLayout sourceName;

  @NonNull
  public final TextInputLayout targetName;

  private DialogMetaRuleEditBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton actionEdit, @NonNull MaterialButton actionNew,
      @NonNull MaterialButton actionRemove, @NonNull ImageView arrowBottom,
      @NonNull PowerSpinnerView attributeType, @NonNull TextInputLayout sourceName,
      @NonNull TextInputLayout targetName) {
    this.rootView = rootView;
    this.actionEdit = actionEdit;
    this.actionNew = actionNew;
    this.actionRemove = actionRemove;
    this.arrowBottom = arrowBottom;
    this.attributeType = attributeType;
    this.sourceName = sourceName;
    this.targetName = targetName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogMetaRuleEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogMetaRuleEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_meta_rule_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogMetaRuleEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_edit;
      MaterialButton actionEdit = ViewBindings.findChildViewById(rootView, id);
      if (actionEdit == null) {
        break missingId;
      }

      id = R.id.action_new;
      MaterialButton actionNew = ViewBindings.findChildViewById(rootView, id);
      if (actionNew == null) {
        break missingId;
      }

      id = R.id.action_remove;
      MaterialButton actionRemove = ViewBindings.findChildViewById(rootView, id);
      if (actionRemove == null) {
        break missingId;
      }

      id = R.id.arrow_bottom;
      ImageView arrowBottom = ViewBindings.findChildViewById(rootView, id);
      if (arrowBottom == null) {
        break missingId;
      }

      id = R.id.attributeType;
      PowerSpinnerView attributeType = ViewBindings.findChildViewById(rootView, id);
      if (attributeType == null) {
        break missingId;
      }

      id = R.id.source_name;
      TextInputLayout sourceName = ViewBindings.findChildViewById(rootView, id);
      if (sourceName == null) {
        break missingId;
      }

      id = R.id.target_name;
      TextInputLayout targetName = ViewBindings.findChildViewById(rootView, id);
      if (targetName == null) {
        break missingId;
      }

      return new DialogMetaRuleEditBinding((ConstraintLayout) rootView, actionEdit, actionNew,
          actionRemove, arrowBottom, attributeType, sourceName, targetName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
