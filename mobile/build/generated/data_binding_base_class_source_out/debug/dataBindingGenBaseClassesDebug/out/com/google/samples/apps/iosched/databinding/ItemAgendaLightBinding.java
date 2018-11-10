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

public abstract class ItemAgendaLightBinding extends ViewDataBinding {
  @Bindable
  protected Block mAgenda;

  protected ItemAgendaLightBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setAgenda(@Nullable Block agenda);

  @Nullable
  public Block getAgenda() {
    return mAgenda;
  }

  @NonNull
  public static ItemAgendaLightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemAgendaLightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemAgendaLightBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_agenda_light, root, attachToRoot, component);
  }

  @NonNull
  public static ItemAgendaLightBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemAgendaLightBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemAgendaLightBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_agenda_light, null, false, component);
  }

  public static ItemAgendaLightBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemAgendaLightBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemAgendaLightBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.item_agenda_light);
  }
}
