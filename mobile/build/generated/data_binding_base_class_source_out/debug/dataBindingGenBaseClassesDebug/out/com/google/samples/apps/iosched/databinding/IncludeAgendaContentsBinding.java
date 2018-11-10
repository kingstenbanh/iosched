package com.google.samples.apps.iosched.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.samples.apps.iosched.shared.model.Block;

public abstract class IncludeAgendaContentsBinding extends ViewDataBinding {
  @NonNull
  public final TextView duration;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final Guideline keyline;

  @NonNull
  public final TextView title;

  @Bindable
  protected Block mAgenda;

  protected IncludeAgendaContentsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView duration, ImageView icon, Guideline keyline, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.duration = duration;
    this.icon = icon;
    this.keyline = keyline;
    this.title = title;
  }

  public abstract void setAgenda(@Nullable Block agenda);

  @Nullable
  public Block getAgenda() {
    return mAgenda;
  }

  @NonNull
  public static IncludeAgendaContentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static IncludeAgendaContentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<IncludeAgendaContentsBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.include_agenda_contents, root, attachToRoot, component);
  }

  @NonNull
  public static IncludeAgendaContentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static IncludeAgendaContentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<IncludeAgendaContentsBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.include_agenda_contents, null, false, component);
  }

  public static IncludeAgendaContentsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static IncludeAgendaContentsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (IncludeAgendaContentsBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.include_agenda_contents);
  }
}
