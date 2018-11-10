package com.google.samples.apps.iosched.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel;

public abstract class FragmentScheduleFilterBinding extends ViewDataBinding {
  @NonNull
  public final Button clearFilters;

  @NonNull
  public final LinearLayout filtersHeader;

  @NonNull
  public final RecyclerView recyclerview;

  @Bindable
  protected ScheduleViewModel mViewModel;

  protected FragmentScheduleFilterBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button clearFilters, LinearLayout filtersHeader,
      RecyclerView recyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clearFilters = clearFilters;
    this.filtersHeader = filtersHeader;
    this.recyclerview = recyclerview;
  }

  public abstract void setViewModel(@Nullable ScheduleViewModel viewModel);

  @Nullable
  public ScheduleViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentScheduleFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentScheduleFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentScheduleFilterBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_schedule_filter, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentScheduleFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentScheduleFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentScheduleFilterBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_schedule_filter, null, false, component);
  }

  public static FragmentScheduleFilterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentScheduleFilterBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentScheduleFilterBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.fragment_schedule_filter);
  }
}
