package com.google.samples.app.iosched.shared.util

import com.google.samples.app.iosched.shared.model.Session
import org.threeten.bp.Duration

val Session.duration: Duration
    get() = Duration.between(startTime, endTime)