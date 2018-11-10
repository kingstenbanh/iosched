package com.google.samples.apps.iosched.ui.schedule;

import android.support.v4.app.Fragment;
import com.google.samples.apps.iosched.ui.schedule.agenda.ScheduleAgendaFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ScheduleModule_ContributeScheduleAgendaFragment$mobile_debug
          .ScheduleAgendaFragmentSubcomponent.class
)
public abstract class ScheduleModule_ContributeScheduleAgendaFragment$mobile_debug {
  private ScheduleModule_ContributeScheduleAgendaFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(ScheduleAgendaFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScheduleAgendaFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScheduleAgendaFragmentSubcomponent
      extends AndroidInjector<ScheduleAgendaFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScheduleAgendaFragment> {}
  }
}
