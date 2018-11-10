package com.google.samples.app.iosched.shared.data.session.agenda

import com.google.samples.app.iosched.shared.model.Block
import javax.inject.Inject
import javax.inject.Singleton
/**
 * Single point of access to agenda data for the presentation layer.
 */
@Singleton
open class AgendaRepository @Inject constructor(private val dataSource: AgendaDataSource) {

    fun getAgenda(): List<Block> {
        return dataSource.getAgenda()
    }
}