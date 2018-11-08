package com.google.samples.app.iosched.shared.usecases

import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.usecases.internal.DefaultScheduler
import timber.log.Timber
import java.lang.ref.WeakReference

abstract class UseCase<in P, out R> {

    private val taskScheduler = DefaultScheduler

    /* The callback is stored with a weak reference to prevent leaks. */
    private lateinit var callback: WeakReference<(Result<R>) -> Any>

    /* Executes the use case asynchronously */
    fun executeAsync(parameters: P, callback: (Result<R>) -> Any) {
        this.callback = WeakReference(callback)

        taskScheduler.execute {
            // Run in background
            try {
                execute(parameters)?.let {
                    notifyResult(it)
                } ?: notifyError(NullPointerException("Result was null"))
            } catch (e: Exception) {
                Timber.d(e)
                notifyError(e)
            }
        }
    }

    /** Executes the use case synchronously  */
    fun executeNow(parameters: P): Result<R> {
        return try {
            Result.Success(execute(parameters))
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    private fun notifyResult(result: R) {
        callback.get()?.let {
            taskScheduler.postToMainThread {
                // Double check because of WeakRef
                val safeCallback: (Result<R>) -> Any = callback.get() ?: return@postToMainThread
                safeCallback(Result.Success(result))
            }
        }
    }

    private fun notifyError(e: Exception) {
        callback.get()?.let {
            taskScheduler.postToMainThread {
                // Double check because of WeakRef
                val safeCallback: (Result<R>) -> Any = callback.get() ?: return@postToMainThread
                safeCallback(Result.Error(e))
            }
        }
    }

    /**
     * Override this to set the code to be executed.
     */
    @Throws(RuntimeException::class)
    protected abstract fun execute(parameters: P): R
}