package com.google.samples.app.iosched.shared.usecases.repository

import com.google.android.gms.maps.model.LatLngBounds
import com.google.samples.app.iosched.shared.data.map.MapMetadataRepository
import com.google.samples.app.iosched.shared.usecases.UseCase
import javax.inject.Inject

open class LoadConferenceLocationUseCase @Inject constructor(
    private val repository: MapMetadataRepository
): UseCase<Unit, LatLngBounds>() {

    override fun execute(parameters: Unit): LatLngBounds {
        return repository.getConferenceLocationBounds()
    }
}