package com.google.samples.apps.iosched.ui.info;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = InfoModule_ContributeFaqFragment$mobile_debug.FaqFragmentSubcomponent.class)
public abstract class InfoModule_ContributeFaqFragment$mobile_debug {
  private InfoModule_ContributeFaqFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(FaqFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      FaqFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface FaqFragmentSubcomponent extends AndroidInjector<FaqFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FaqFragment> {}
  }
}
