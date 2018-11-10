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
import android.widget.LinearLayout;
import com.google.android.gms.maps.MapView;
import com.google.samples.apps.iosched.ui.map.MapViewModel;

public abstract class FragmentMapBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout appbar;

  @NonNull
  public final MapView map;

  @Bindable
  protected MapViewModel mViewModel;

  protected FragmentMapBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout appbar, MapView map) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.map = map;
  }

  public abstract void setViewModel(@Nullable MapViewModel viewModel);

  @Nullable
  public MapViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMapBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_map, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMapBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_map, null, false, component);
  }

  public static FragmentMapBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentMapBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentMapBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.fragment_map);
  }
}
