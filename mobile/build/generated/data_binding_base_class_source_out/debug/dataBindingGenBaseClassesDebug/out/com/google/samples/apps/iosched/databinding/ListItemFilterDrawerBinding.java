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
import android.widget.CheckedTextView;
import com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel;
import com.google.samples.apps.iosched.ui.schedule.TagFilter;

public abstract class ListItemFilterDrawerBinding extends ViewDataBinding {
  @NonNull
  public final CheckedTextView filterLabel;

  @Bindable
  protected TagFilter mTagFilter;

  @Bindable
  protected ScheduleViewModel mViewModel;

  protected ListItemFilterDrawerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CheckedTextView filterLabel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.filterLabel = filterLabel;
  }

  public abstract void setTagFilter(@Nullable TagFilter tagFilter);

  @Nullable
  public TagFilter getTagFilter() {
    return mTagFilter;
  }

  public abstract void setViewModel(@Nullable ScheduleViewModel viewModel);

  @Nullable
  public ScheduleViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemFilterDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListItemFilterDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListItemFilterDrawerBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.list_item_filter_drawer, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemFilterDrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListItemFilterDrawerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListItemFilterDrawerBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.list_item_filter_drawer, null, false, component);
  }

  public static ListItemFilterDrawerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ListItemFilterDrawerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ListItemFilterDrawerBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.list_item_filter_drawer);
  }
}
