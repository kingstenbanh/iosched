package com.google.samples.apps.iosched.shared.domain.sessions

import com.google.samples.apps.iosched.shared.data.session.SessionRepository
import com.google.samples.apps.iosched.shared.domain.UseCase
import com.google.samples.apps.iosched.shared.model.Session
import javax.inject.Inject

/**
 * Gets offline sessions from the repository.
 */
open class LoadOfflineSessionsUseCase @Inject constructor(private val repository: SessionRepository)
    : UseCase<Unit, List<Session>>() {
    override fun execute(parameters: Unit): List<Session> {
        return repository.getSessionsOffline()
    }
}