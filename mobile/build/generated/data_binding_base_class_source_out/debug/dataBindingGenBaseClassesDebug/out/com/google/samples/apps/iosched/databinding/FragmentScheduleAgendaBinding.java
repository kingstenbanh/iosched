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
import com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel;

public abstract class FragmentScheduleAgendaBinding extends ViewDataBinding {
  @Bindable
  protected ScheduleViewModel mViewModel;

  protected FragmentScheduleAgendaBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable ScheduleViewModel viewModel);

  @Nullable
  public ScheduleViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentScheduleAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentScheduleAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentScheduleAgendaBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_schedule_agenda, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentScheduleAgendaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentScheduleAgendaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentScheduleAgendaBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_schedule_agenda, null, false, component);
  }

  public static FragmentScheduleAgendaBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentScheduleAgendaBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentScheduleAgendaBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.fragment_schedule_agenda);
  }
}
