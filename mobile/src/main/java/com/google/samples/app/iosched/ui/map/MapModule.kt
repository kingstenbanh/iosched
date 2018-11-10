package com.google.samples.app.iosched.ui.map

import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

/**
 * Module where classes needed to create the [MapFragment] are defined.
 */
@Module
internal abstract class MapModule {

    /**
     * Generates an [AndroidInjector] for the [MapFragment] as a Dagger subcomponent of the
     * [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeMapFragment(): MapFragment

    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [MapViewModel] class.
     */
    @Binds
    @IntoMap
    @ViewModelKey(MapViewModel::class)
    abstract fun bindMapFragmentViewModel(viewModel: MapViewModel): ViewModel
}