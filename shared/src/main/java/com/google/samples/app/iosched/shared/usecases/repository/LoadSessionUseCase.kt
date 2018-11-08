package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.usecases.UseCase

open class LoadSessionUseCase(private val repository: SessionRepository) :
    UseCase<String, List<Session>>() {

    override fun execute(parameters: String): List<Session> {
        Thread.sleep(3000)
        return repository.getSessions()
    }
}