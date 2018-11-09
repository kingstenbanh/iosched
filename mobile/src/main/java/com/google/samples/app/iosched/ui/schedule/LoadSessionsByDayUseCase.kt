package com.google.samples.app.iosched.ui.schedule

import android.support.v4.util.ArrayMap
import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.usecases.UseCase
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay
import javax.inject.Inject

open class LoadSessionsByDayUseCase @Inject constructor(private val repository: SessionRepository)
    : UseCase<SessionFilters, Map<ConferenceDay, List<Session>>>() {

    override fun execute(parameters: SessionFilters): Map<ConferenceDay, List<Session>> {
        val allSessions = repository.getSessions()

        return ArrayMap<ConferenceDay, List<Session>>().apply {
            for (day in ConferenceDay.values()) {
                put(day, allSessions
                    .filter { day.contains(it) }
                    .sortedBy { it.startTime })
            }
        }
    }
}