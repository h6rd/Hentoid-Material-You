// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class IntroSlide06Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView list;

  @NonNull
  public final LinearLayout main;

  private IntroSlide06Binding(@NonNull LinearLayout rootView, @NonNull RecyclerView list,
      @NonNull LinearLayout main) {
    this.rootView = rootView;
    this.list = list;
    this.main = main;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IntroSlide06Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IntroSlide06Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.intro_slide_06, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IntroSlide06Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.list;
      RecyclerView list = ViewBindings.findChildViewById(rootView, id);
      if (list == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      return new IntroSlide06Binding((LinearLayout) rootView, list, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}