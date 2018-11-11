package com.google.samples.apps.iosched.shared.domain.sessions

import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository
import com.google.samples.apps.iosched.shared.data.UpdateSource
import com.google.samples.apps.iosched.shared.domain.UseCase
import javax.inject.Inject

/**
 * Gets offline sessions from the repository.
 */
open class GetsOriginOfConferenceData @Inject constructor(
    private val repository: ConferenceDataRepository
) : UseCase<Unit, UpdateSource>() {

    override fun execute(parameters: Unit): UpdateSource {
        return repository.latestUpdateSource
    }
}