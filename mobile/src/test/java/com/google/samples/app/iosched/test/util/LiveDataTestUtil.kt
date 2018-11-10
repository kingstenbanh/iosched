package com.google.samples.app.iosched.test.util

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

/**
 * Safely handles observables from LiveData for testing.
 *
 * TODO: Move to testutils module b/72216577
 */
object LiveDataTestUtil {

    /**
     * Get the value of a LiveData safely
     */
    @Throws(InterruptedException::class)
    fun <T> getValue(liveData: LiveData<T>): T? {
        var data: T? = null
        val latch = CountDownLatch(1)
        val observer = object: Observer<T> {
            override fun onChanged(t: T?) {
                data = t
                latch.countDown()
                liveData.removeObserver(this)
            }
        }
        liveData.observeForever(observer)
        latch.await(2, TimeUnit.SECONDS)

        return data
    }
}