package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.map.MapMetadataRepository
import com.google.samples.app.iosched.shared.usecases.UseCase
import javax.inject.Inject

open class LoadConferenceMinZoomUseCase @Inject constructor(
    private val repository: MapMetadataRepository
) : UseCase<Unit, Float>() {

    override fun execute(parameters: Unit): Float {
        return repository.getMapMinZoom()
    }
}