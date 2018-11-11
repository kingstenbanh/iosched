package com.google.samples.apps.iosched.shared.data

import android.content.Context
import android.support.annotation.WorkerThread
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import java.io.IOException

const val URL = "https://firebasestorage.googleapis.com/v0/b/iosched-playground.appspot.com/o/" +
        "conference_data.json?alt=media&token=0c0a7ce8-f582-4ab2-a66e-29f335680399"

/**
 * Downloads session data.
 */
class ConferenceDataDownloader(
    private val context: Context,
    private val bootstrapVersion: String
) {
    // TODO: Provie this, only one client should exist
    private val client: OkHttpClient by lazy {
        val logInterceptor = HttpLoggingInterceptor()
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC)

        val protocols = arrayListOf(Protocol.HTTP_1_1, Protocol.HTTP_2) // Support h2

        val cacheSize = 2L * 1024 * 1024 // 2 MiB
        val cacheDir = context.getDir("conference_data", Context.MODE_PRIVATE)
        val cache = Cache(cacheDir, cacheSize)

        OkHttpClient.Builder()
            .protocols(protocols)
            .cache(cache)
            .addInterceptor(logInterceptor)
            .build()
    }

    @Throws(IOException::class)
    @WorkerThread
    fun fetch(): Response {

        Timber.d("Download started from: $URL")

        val httpBuilder = HttpUrl.parse(URL)?.newBuilder()
            ?: throw IllegalArgumentException("Malformed Session data URL")
        httpBuilder.addQueryParameter("bootstrapVersion", bootstrapVersion)

        val request = Request.Builder()
            .url(httpBuilder.build())
            .cacheControl(CacheControl.FORCE_NETWORK)
            .build()

        // Blocking call
        val response = client.newCall(request).execute()

        // TODO: Delete cache somehow
        Timber.d("Download bytes: ${response.body()?.contentLength() ?: 0}")

        return response ?: throw IOException("Network error")
    }

    fun fetchCached(): Response? {
        Timber.d("Fetching cached file")

        val httpBuilder = HttpUrl.parse(URL)?.newBuilder()
            ?: throw IllegalArgumentException("Malformed Session data URL")
        httpBuilder.addQueryParameter("bootstrapVersion", bootstrapVersion)

        val request = Request.Builder()
            .url(httpBuilder.build())
            .cacheControl(CacheControl.FORCE_CACHE)
            .build()

        // Blocking call
        val response = client.newCall(request).execute()

        Timber.d("Loaded cache. Bytes: ${response.body()?.contentLength() ?: 0}")

        if (response.code() == 504) {
            return null
        }

        return response ?: throw IOException("Network error")
    }
}