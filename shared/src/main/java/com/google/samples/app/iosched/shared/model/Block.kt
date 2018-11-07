package com.google.samples.app.iosched.shared.model

import org.threeten.bp.ZonedDateTime

data class Block(

    /**
     * The title of the block. Example, "Sandbox".
     */
    val title: String,

    /**
     * The subtitle of the block. Example, "Registration" (with title "Badge Pick-Up").
     */
    val subtitle: String,

    /**
     * The kind of block. Example, "concert", or "meal".
     */
    val kind: String,

    /**
     * Start time
     */
    val startTime: ZonedDateTime,

    /**
     * End time
     */
    val endTime: ZonedDateTime
)