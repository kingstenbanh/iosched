package com.google.samples.apps.iosched.ui.map;

import android.support.v4.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MapModule_ContributeMapFragment$mobile_debug.MapFragmentSubcomponent.class)
public abstract class MapModule_ContributeMapFragment$mobile_debug {
  private MapModule_ContributeMapFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(MapFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      MapFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface MapFragmentSubcomponent extends AndroidInjector<MapFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MapFragment> {}
  }
}
