package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.usecases.UseCase
import javax.inject.Inject

/**
 * TODO: Example use case that simulates a delay.
 */
open class LoadSessionUseCase @Inject constructor(
    private val repository: SessionRepository
) : UseCase<String, Session>() {

    override fun execute(parameters: String): Session {
        Thread.sleep(3000)
        return repository.getSession(parameters)
    }
}