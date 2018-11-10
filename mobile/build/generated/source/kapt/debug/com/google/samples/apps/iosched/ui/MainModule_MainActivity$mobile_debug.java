package com.google.samples.apps.iosched.ui;

import android.app.Activity;
import com.google.samples.apps.iosched.ui.info.InfoModule;
import com.google.samples.apps.iosched.ui.map.MapModule;
import com.google.samples.apps.iosched.ui.schedule.ScheduleModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainModule_MainActivity$mobile_debug.MainActivitySubcomponent.class)
public abstract class MainModule_MainActivity$mobile_debug {
  private MainModule_MainActivity$mobile_debug() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {ScheduleModule.class, MapModule.class, InfoModule.class})
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
