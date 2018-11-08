package com.google.samples.app.iosched.shared.model

import org.threeten.bp.ZonedDateTime


data class Session(
    /**
     * Unique string identifying this session.
     */
    val id: String,

    /**
     * Start time of the session
     */
    val startTime: ZonedDateTime,

    /**
     * End time of the session
     */
    val endTime: ZonedDateTime,

    /**
     * Session title.
     */
    val title: String,

    /**
     * Body of text explaining this session in detail.
     */
    val abstract: String,

    /**
     * The sesion room.
     */
    val room: Room,

    /**
     * Full URL for the session online.
     */
    val sessionUrl: String,

    /**
     * Url for the session livestream.
     */
    val liveStreamUrl: String,

    /**
     * Full URL to YouTube.
     */
    val youTubeUrl: String,

    /**
     * The [Tag]s associated with the session. Ordered, with the most important tags appearing
     * first.
     */
    val tags: List<Tag>,

    /**
     * The session speakers.
     */
    val speakers: Set<Speaker>,

    /**
     * The session's photo URL.
     */
    val photoUrl: String,

    /**
     * Sessions related to this session.
     */
    val relatedSessions: Set<Session>
)