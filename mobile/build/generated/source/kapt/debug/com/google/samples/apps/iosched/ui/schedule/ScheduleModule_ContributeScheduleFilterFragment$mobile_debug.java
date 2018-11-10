package com.google.samples.apps.iosched.ui.schedule;

import android.support.v4.app.Fragment;
import com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ScheduleModule_ContributeScheduleFilterFragment$mobile_debug
          .ScheduleFilterFragmentSubcomponent.class
)
public abstract class ScheduleModule_ContributeScheduleFilterFragment$mobile_debug {
  private ScheduleModule_ContributeScheduleFilterFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(ScheduleFilterFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScheduleFilterFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleFilterFragmentSubcomponent
      extends AndroidInjector<ScheduleFilterFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleFilterFragment> {}
  }
}
