package com.google.samples.app.iosched.shared.model

data class Tag (
    /**
     * Unique string identifying this tag.
     */
    val id: String,

    /**
     * Tag category type. For example, "Track", "Level", "Type", "Theme". etc.
     */
    val category: String,

    /**
     * Tag name within a category. For example, "Android", or "Ads", or "Design".
     */
    val name: String,

    /**
     * The color associated with this tag as a hex string. Example, "#FFEE88".
     */
    val color: String
)