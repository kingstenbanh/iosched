package com.google.samples.apps.iosched.databinding;

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
import android.widget.TextView;

public abstract class FragmentInfoBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TabLayout tabs;

  @NonNull
  public final TextView title;

  @NonNull
  public final ViewPager viewpager;

  protected FragmentInfoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, TabLayout tabs, TextView title,
      ViewPager viewpager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.tabs = tabs;
    this.title = title;
    this.viewpager = viewpager;
  }

  @NonNull
  public static FragmentInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentInfoBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_info, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentInfoBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_info, null, false, component);
  }

  public static FragmentInfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentInfoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentInfoBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.fragment_info);
  }
}
