package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.usecases.UseCase
import com.google.maps.android.data.geojson.GeoJsonFeature
import javax.inject.Inject

open class LoadMarkersUseCase @Inject constructor() : UseCase<String, GeoJsonFeature?>() {

    override fun execute(parameters: String): GeoJsonFeature? {
        // TODO get markers from repository.
        return null
    }
}