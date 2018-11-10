package com.google.samples.apps.iosched.ui.info;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = InfoModule_ContributeEventFragment$mobile_debug.EventFragmentSubcomponent.class
)
public abstract class InfoModule_ContributeEventFragment$mobile_debug {
  private InfoModule_ContributeEventFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(EventFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      EventFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface EventFragmentSubcomponent extends AndroidInjector<EventFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EventFragment> {}
  }
}
