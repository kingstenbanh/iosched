package com.google.samples.apps.iosched.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel;

public abstract class FragmentScheduleBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final TabLayout tabs;

  @NonNull
  public final TextView title;

  @NonNull
  public final ViewPager viewpager;

  @Bindable
  protected ScheduleViewModel mViewModel;

  protected FragmentScheduleBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, ProgressBar loading, TabLayout tabs,
      TextView title, ViewPager viewpager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.loading = loading;
    this.tabs = tabs;
    this.title = title;
    this.viewpager = viewpager;
  }

  public abstract void setViewModel(@Nullable ScheduleViewModel viewModel);

  @Nullable
  public ScheduleViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentScheduleBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_schedule, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentScheduleBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_schedule, null, false, component);
  }

  public static FragmentScheduleBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentScheduleBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentScheduleBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.fragment_schedule);
  }
}
