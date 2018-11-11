package com.google.samples.apps.iosched.shared.data.session.json

import org.threeten.bp.ZonedDateTime
/**
 * Like `Session` but with list of IDs instead of objects in tags, speakers and related sessions.
 */
data class SessionTemp(
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
     * Full URL for the session online.
     */
    val sessionUrl: String,

    /**
     * The session room.
     */
    val room: String,

    /**
     * Url for the session livestream.
     */
    val liveStreamUrl: String,

    /**
     * Full URL to YouTube.
     */
    val youTubeUrl: String,

    /**
     * IDs of the `Tag`s associated with the session. Ordered, with the most important tags
     * appearing first.
     */
    val tags: List<String>,

    /**
     * IDs of the session speakers.
     */
    val speakers: Set<String>,

    /**
     * The session's photo URL.
     */
    val photoUrl: String,

    /**
     * IDs of the sessions related to this session.
     */
    val relatedSessions: Set<String>
)