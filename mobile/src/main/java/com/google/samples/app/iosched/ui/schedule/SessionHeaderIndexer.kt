package com.google.samples.app.iosched.ui.schedule

import com.google.samples.app.iosched.shared.model.Session
import org.threeten.bp.ZonedDateTime

/**
 * Find the first session at each start time (rounded down to nearest hour) and return pairs of
 * index to start time. Assumes that [sessions] are sorted by ascending start time.
 */
fun indexSessionHeaders(sessions: List<Session>): List<Pair<Int, ZonedDateTime>> {
    return sessions
        .mapIndexed { index, session -> index to session.startTime }
        .distinctBy { it.second.hour }
}