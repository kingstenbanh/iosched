package com.google.samples.apps.iosched.ui.info;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = InfoModule_ContributeTravelFragment$mobile_debug.TravelFragmentSubcomponent.class
)
public abstract class InfoModule_ContributeTravelFragment$mobile_debug {
  private InfoModule_ContributeTravelFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(TravelFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TravelFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TravelFragmentSubcomponent extends AndroidInjector<TravelFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TravelFragment> {}
  }
}
