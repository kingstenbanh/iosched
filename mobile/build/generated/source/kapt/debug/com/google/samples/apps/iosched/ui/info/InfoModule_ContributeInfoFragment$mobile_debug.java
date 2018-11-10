package com.google.samples.apps.iosched.ui.info;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = InfoModule_ContributeInfoFragment$mobile_debug.InfoFragmentSubcomponent.class
)
public abstract class InfoModule_ContributeInfoFragment$mobile_debug {
  private InfoModule_ContributeInfoFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(InfoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      InfoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface InfoFragmentSubcomponent extends AndroidInjector<InfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<InfoFragment> {}
  }
}
