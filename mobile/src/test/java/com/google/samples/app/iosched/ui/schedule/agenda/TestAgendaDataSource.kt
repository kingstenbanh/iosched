package com.google.samples.app.iosched.ui.schedule.agenda

import com.google.samples.app.iosched.shared.data.session.agenda.AgendaDataSource
import com.google.samples.app.iosched.shared.model.Block
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime

class TestAgendaDataSource : AgendaDataSource {

    private val time1 = ZonedDateTime.of(2017, 3, 12, 12, 0, 0, 0, ZoneId.of("Asia/Tokyo"))

    val block = Block(
        title = "Keynote",
        type = "keynote",
        color = 0xffff00ff.toInt(),
        startTime = time1,
        endTime = time1.plusHours(1L)
    )
    override fun getAgenda() = listOf(block)

}