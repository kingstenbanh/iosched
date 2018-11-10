package com.google.samples.app.iosched.tv.util

import android.support.v17.leanback.widget.ArrayObjectAdapter
import android.support.v17.leanback.widget.Presenter

/**
 * Extension functions to make the [ArrayObjectAdapter] feel like a [Collection] object and provides
 * convenience functions to convert from a [Collection] to an [ArrayObjectAdapter] instance.
 */

operator fun <T> ArrayObjectAdapter.plusAssign(element: T) {
    this.add(element)
}

inline fun <reified T> Collection<T>.toArrayObjectAdapter(
    presenter: Presenter
): ArrayObjectAdapter {
    val adapter = ArrayObjectAdapter(presenter)
    return copyIntoArrayObjectAdapter(adapter)
}

fun <T> Collection<T>.copyIntoArrayObjectAdapter(
    adapter: ArrayObjectAdapter
): ArrayObjectAdapter {
    this.forEach { item -> adapter += item }
    return adapter
}