package com.google.samples.apps.iosched.ui.sessiondetail;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SessionDetailModule_ContributeSessionDetailFragment$mobile_debug
          .SessionDetailFragmentSubcomponent.class
)
public abstract class SessionDetailModule_ContributeSessionDetailFragment$mobile_debug {
  private SessionDetailModule_ContributeSessionDetailFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(SessionDetailFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SessionDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SessionDetailFragmentSubcomponent
      extends AndroidInjector<SessionDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SessionDetailFragment> {}
  }
}
