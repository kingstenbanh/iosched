package com.google.samples.app.iosched.ui.schedule.agenda

import com.google.samples.app.iosched.shared.model.Block
import org.threeten.bp.ZonedDateTime

/**
 * Find the first block of each day (rounded down to nearest day) and return pairs of
 * index to start time. Assumes that [agendaItems] are sorted by ascending start time.
 */
fun indexAgendaHeaders(agendaItems: List<Block>): List<Pair<Int, ZonedDateTime>> {
    return agendaItems
        .mapIndexed { index, block -> index to block.startTime }
        .distinctBy { it.second.dayOfMonth }
}