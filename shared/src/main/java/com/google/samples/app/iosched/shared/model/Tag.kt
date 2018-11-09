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
     * This tag's order within its [category].
     */
    val orderInCategory: Int,

    /**
     * Tag name within a category. For example, "Android", or "Ads", or "Design".
     */
    val name: String,

    /**
     * The color associated with this tag as a color integer.
     */
    val color: Int
)