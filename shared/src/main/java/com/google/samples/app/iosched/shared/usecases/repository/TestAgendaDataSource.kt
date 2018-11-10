package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.session.agenda.AgendaDataSource
import com.google.samples.app.iosched.shared.model.Block
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime

object TestAgendaDataSource : AgendaDataSource {

    private val time1 = ZonedDateTime.of(2017, 3, 12, 12, 0, 0, 0, ZoneId.of("Asia/Tokyo"))
    private val time2 = ZonedDateTime.of(2017, 3, 12, 13, 0, 0, 0, ZoneId.of("Asia/Tokyo"))

    private val block1 = Block(
        title = "Keynote",
        type = "keynote",
        color = 0xffff00ff.toInt(),
        startTime = time1,
        endTime = time2
    )

    private val block2 = Block(
        title = "Breakfast",
        type = "meal",
        color = 0xffff00ff.toInt(),
        startTime = time1.plusDays(1L),
        endTime = time2.plusDays(1L)
    )

    override fun getAgenda() = listOf(block1, block2)
}