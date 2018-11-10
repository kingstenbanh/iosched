package com.google.samples.app.iosched.shared.model

import org.threeten.bp.ZonedDateTime

data class Block(

    /**
     * The title of the block. Example, "Sandbox".
     */
    val title: String,

    /**
     * The type of agenda item. Example, "concert", or "meal".
     */
    val type: String,

    /**
     * The color of the block.
     */
    val color: Int,

    /**
     * The stroke color of the block (defaults to [color])
     */
    val strokeColor: Int = color,

    /**
     * If [color] is dark i.e. overlaid text should be light (defaults to false)
     */
    val isDark: Boolean = false,

    /**
     * Start time
     */
    val startTime: ZonedDateTime,

    /**
     * End time
     */
    val endTime: ZonedDateTime
)