package com.google.samples.apps.iosched.ui.sessiondetail;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SessionDetailModule_SessionDetailActivity$mobile_debug.SessionDetailActivitySubcomponent.class
)
public abstract class SessionDetailModule_SessionDetailActivity$mobile_debug {
  private SessionDetailModule_SessionDetailActivity$mobile_debug() {}

  @Binds
  @IntoMap
  @ActivityKey(SessionDetailActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SessionDetailActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface SessionDetailActivitySubcomponent
      extends AndroidInjector<SessionDetailActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SessionDetailActivity> {}
  }
}
