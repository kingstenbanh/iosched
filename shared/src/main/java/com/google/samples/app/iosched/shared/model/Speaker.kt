package com.google.samples.app.iosched.shared.model

data class Speaker(
    /**
     * Unique string identifying this speaker.
     */
    val id: String,

    /**
     * Name of this speaker.
     */
    val name: String,

    /**
     * Profile photo of this speaker.
     */
    val imageUrl: String = "",

    /**
     * Company this speaker works for.
     */
    val company: String = "",

    /**
     * Text describing this speaker in detail.
     */
    val abstract: String = "",

    /**
     * Full URL of the speaker's G+ profile.
     */
    val gPlusUrl: String = "",

    /**
     * Full URL of the speaker's Twitter profile.
     */
    val twitterUrl: String = ""
)