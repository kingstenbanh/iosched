package com.google.samples.apps.iosched.ui.info;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      InfoModule_ContributeSettingsFragment$mobile_debug.SettingsFragmentSubcomponent.class
)
public abstract class InfoModule_ContributeSettingsFragment$mobile_debug {
  private InfoModule_ContributeSettingsFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(SettingsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SettingsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SettingsFragmentSubcomponent extends AndroidInjector<SettingsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SettingsFragment> {}
  }
}
