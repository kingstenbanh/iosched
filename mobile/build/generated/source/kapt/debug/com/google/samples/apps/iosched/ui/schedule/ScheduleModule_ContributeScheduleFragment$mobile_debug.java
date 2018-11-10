package com.google.samples.apps.iosched.ui.schedule;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ScheduleModule_ContributeScheduleFragment$mobile_debug.ScheduleFragmentSubcomponent.class
)
public abstract class ScheduleModule_ContributeScheduleFragment$mobile_debug {
  private ScheduleModule_ContributeScheduleFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(ScheduleFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScheduleFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleFragmentSubcomponent extends AndroidInjector<ScheduleFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleFragment> {}
  }
}
