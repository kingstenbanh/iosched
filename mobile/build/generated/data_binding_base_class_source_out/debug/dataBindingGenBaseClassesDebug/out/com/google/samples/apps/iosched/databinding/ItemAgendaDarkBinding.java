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
import com.google.samples.apps.iosched.shared.model.Block;

public abstract class ItemAgendaDarkBinding extends ViewDataBinding {
  @Bindable
  protected Block mAgenda;

  protected ItemAgendaDarkBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setAgenda(@Nullable Block agenda);

  @Nullable
  public Block getAgenda() {
    return mAgenda;
  }

  @NonNull
  public static ItemAgendaDarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemAgendaDarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemAgendaDarkBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_agenda_dark, root, attachToRoot, component);
  }

  @NonNull
  public static ItemAgendaDarkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemAgendaDarkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemAgendaDarkBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_agenda_dark, null, false, component);
  }

  public static ItemAgendaDarkBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemAgendaDarkBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemAgendaDarkBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.item_agenda_dark);
  }
}
