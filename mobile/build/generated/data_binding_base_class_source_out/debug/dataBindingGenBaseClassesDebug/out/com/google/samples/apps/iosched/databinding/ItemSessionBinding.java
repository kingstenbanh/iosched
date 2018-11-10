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
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.samples.apps.iosched.shared.model.Session;
import com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener;

public abstract class ItemSessionBinding extends ViewDataBinding {
  @NonNull
  public final Guideline keyline;

  @NonNull
  public final TextView lengthLocation;

  @NonNull
  public final ImageButton overflow;

  @NonNull
  public final LinearLayout tags;

  @NonNull
  public final HorizontalScrollView tagsContainer;

  @NonNull
  public final TextView title;

  @Bindable
  protected Session mSession;

  @Bindable
  protected ScheduleEventListener mEventListener;

  protected ItemSessionBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Guideline keyline, TextView lengthLocation, ImageButton overflow,
      LinearLayout tags, HorizontalScrollView tagsContainer, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.keyline = keyline;
    this.lengthLocation = lengthLocation;
    this.overflow = overflow;
    this.tags = tags;
    this.tagsContainer = tagsContainer;
    this.title = title;
  }

  public abstract void setSession(@Nullable Session session);

  @Nullable
  public Session getSession() {
    return mSession;
  }

  public abstract void setEventListener(@Nullable ScheduleEventListener eventListener);

  @Nullable
  public ScheduleEventListener getEventListener() {
    return mEventListener;
  }

  @NonNull
  public static ItemSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemSessionBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_session, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSessionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemSessionBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_session, null, false, component);
  }

  public static ItemSessionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemSessionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemSessionBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.item_session);
  }
}
