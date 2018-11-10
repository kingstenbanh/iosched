package com.google.samples.apps.iosched.ui.schedule;

import android.support.v4.app.Fragment;
import com.google.samples.apps.iosched.ui.schedule.day.ScheduleDayFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ScheduleModule_ContributeScheduleDayFragment$mobile_debug.ScheduleDayFragmentSubcomponent
          .class
)
public abstract class ScheduleModule_ContributeScheduleDayFragment$mobile_debug {
  private ScheduleModule_ContributeScheduleDayFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(ScheduleDayFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScheduleDayFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleDayFragmentSubcomponent extends AndroidInjector<ScheduleDayFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleDayFragment> {}
  }
}
