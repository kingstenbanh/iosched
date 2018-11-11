package com.google.samples.apps.iosched.shared.domain

import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository
import javax.inject.Inject

/**
 * Forces a refresh in the conference data repository.
 */
open class RefreshConferenceDataUseCase @Inject constructor(
    private val repository: ConferenceDataRepository
) : UseCase<Any, Boolean>() {

    override fun execute(parameters: Any): Boolean{
        repository.getConferenceData(forceUpdate = true)
        return true
    }
}