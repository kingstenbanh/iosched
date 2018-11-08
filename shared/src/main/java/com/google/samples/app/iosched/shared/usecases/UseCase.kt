package com.google.samples.app.iosched.shared.usecases

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.usecases.internal.DefaultScheduler
import timber.log.Timber

abstract class UseCase<in P, R> {

    private val taskScheduler = DefaultScheduler

    /** Executes the use case asynchronously
     *
     * @return an observable [LiveData] with a [Result].
     *
     * @param parameters the input parameters to run the use case with
     */
    fun executeAsync(parameters: P): LiveData<Result<R>> {
        val liveCallback: MutableLiveData<Result<R>> = MutableLiveData()

        try {
            taskScheduler.execute {
                execute(parameters).let { result ->
                    liveCallback.postValue(Result.Success(result))
                }
            }
        } catch (e: Exception) {
            Timber.d(e)
            liveCallback.postValue(Result.Error(e))
        }

        return liveCallback
    }

    /** Executes the use case synchronously  */
    fun executeNow(parameters: P): Result<R> {
        return try {
            Result.Success(execute(parameters))
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    /**
     * Override this to set the code to be executed.
     */
    @Throws(RuntimeException::class)
    protected abstract fun execute(parameters: P): R
}