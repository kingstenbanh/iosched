package com.google.samples.app.iosched.shared.util

import android.arch.lifecycle.*
import android.os.Bundle
import android.os.Parcel
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Implementation of lazy that is not thread safe. Useful when you know what thread you will be
 * executing on and are not worried about synchronization.
 */
fun <T> lazyFast(operation: () -> T): Lazy<T> = lazy(LazyThreadSafetyMode.NONE) {
    operation()
}

inline fun consume(f: () -> Unit): Boolean {
    f()
    return true
}

/**
 * Allows calls like
 *
 * `viewGroup.inflate(R.layout.foo)`
 */
fun ViewGroup.inflate(@LayoutRes layout: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layout, this, attachToRoot)
}

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}

// region ViewModels

/**
 * For Actvities, allows declarations like
 * ```
 * val myViewModelv = iewModelProvider(myViewModelFactory)
 * ```
 */
inline fun <reified VM: ViewModel> FragmentActivity.viewModelProvider(
    provider: ViewModelProvider.Factory
) = lazyFast {
    ViewModelProviders.of(this, provider).get(VM::class.java)
}

/**
 * For Fragments, allows declarations like
 * ```
 * val myViewModel = viewModelProvider(myViewModelFactory)
 * ```
 */
inline fun <reified VM: ViewModel> Fragment.viewModelProvider(
    provider: ViewModelProvider.Factory
) = ViewModelProviders.of(this, provider).get(VM::class.java)

/**
 * Like [Fragment.viewModelProvider] for Fragments that want a [ViewModel] scoped to the Activity.
 */
inline fun <reified VM: ViewModel> Fragment.activityViewModelProvider(
    provider: ViewModelProvider.Factory
) = ViewModelProviders.of(activity!!, provider).get(VM::class.java)

/**
 * Like [Fragment.viewModelProvider] for Fragments that want a [ViewModel] scoped to the parent
 * Fragment.
 */
inline fun <reified VM : ViewModel> Fragment.parentViewModelProvider(
    provider: ViewModelProvider.Factory) =
    ViewModelProviders.of(parentFragment!!, provider).get(VM::class.java)

// endregion

// region Parcelables, Bundles

/** Write an enum value to a Parcel */
fun <T : Enum<T>> Parcel.writeEnum(value: T) = writeString(value.name)

/** Read an enum value from a Parcel */
inline fun <reified T : Enum<T>> Parcel.readEnum(): T = enumValueOf(readString())

/** Write an enum value to a Bundle */
fun <T : Enum<T>> Bundle.putEnum(key: String, value: T) = putString(key, value.name)

/** Read an enum value from a Bundle */
inline fun <reified T : Enum<T>> Bundle.getEnum(key: String): T = enumValueOf(getString(key))

// endregion

// region LiveData

/** Uses `Transformations.map` on a LiveData */
fun <X, T> LiveData<T>.map(body: (T) -> X): LiveData<X> {
    return Transformations.map(this, body)
}

/** Uses `Transformations.switchMap` on a LiveData */
fun <X, T> LiveData<T>.switchMap(body: (T) -> LiveData<X>): LiveData<X> {
    return Transformations.switchMap(this, body)
}
