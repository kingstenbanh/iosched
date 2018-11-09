package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.usecases.UseCase
import javax.inject.Inject

open class LoadSessionsUseCase @Inject constructor(
    private val repository: SessionRepository
) : UseCase<Unit, List<Session>>() {

    override fun execute(parameters: Unit): List<Session> {
        Thread.sleep(3000)
        return repository.getSessions()
    }
}