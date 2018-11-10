package com.google.samples.app.iosched.ui.info

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Module where classes needed to create the [InfoFragment] are defined.
 */
@Module
internal abstract class InfoModule {

    /**
     * Generates an [AndroidInjector] for the [InfoFragment] as a Dagger subcomponent of the
     * [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeInfoFragment(): InfoFragment

    /**
     * Generates an [AndroidInjector] for the [EventFragment] as a Dagger subcomponent of the
     * [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeEventFragment(): EventFragment

    /**
     * Generates an [AndroidInjector] for the [TravelFragment] as a Dagger subcomponent of the
     * [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeTravelFragment(): TravelFragment

    /**
     * Generates an [AndroidInjector] for the [FaqFragment] as a Dagger subcomponent of the
     * [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeFaqFragment(): FaqFragment

    /**
     * Generates an [AndroidInjector] for the [SettingsFragment] as a Dagger subcomponent of the
     * [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeSettingsFragment(): SettingsFragment
}