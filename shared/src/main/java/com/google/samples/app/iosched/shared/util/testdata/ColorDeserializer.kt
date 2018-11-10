package com.google.samples.app.iosched.shared.util.testdata

import android.graphics.Color
import com.google.samples.app.iosched.shared.util.ColorUtils
import timber.log.Timber

fun parseColor(colorString: String?): Int {
    return if (colorString != null) {
        try {
            ColorUtils.parseHexColor(colorString)
        } catch (t: Throwable) {
            Timber.d(t, "Failed to parse color")
            Color.TRANSPARENT
        }
    } else {
        Color.TRANSPARENT
    }
}