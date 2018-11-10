package com.google.samples.app.iosched.shared.data.session.agenda

import com.google.samples.app.iosched.shared.model.Block

interface AgendaDataSource {
    fun getAgenda(): List<Block>
}