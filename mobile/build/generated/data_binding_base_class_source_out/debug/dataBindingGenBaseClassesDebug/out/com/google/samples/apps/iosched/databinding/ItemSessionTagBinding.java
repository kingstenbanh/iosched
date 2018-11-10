package com.google.samples.apps.iosched.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.samples.apps.iosched.shared.model.Tag;

public abstract class ItemSessionTagBinding extends ViewDataBinding {
  @NonNull
  public final Button tagButton;

  @Bindable
  protected Tag mTag;

  protected ItemSessionTagBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button tagButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tagButton = tagButton;
  }

  public abstract void setTag(@Nullable Tag tag);

  @Nullable
  public Tag getTag() {
    return mTag;
  }

  @NonNull
  public static ItemSessionTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemSessionTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemSessionTagBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_session_tag, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSessionTagBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemSessionTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemSessionTagBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_session_tag, null, false, component);
  }

  public static ItemSessionTagBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemSessionTagBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemSessionTagBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.item_session_tag);
  }
}
