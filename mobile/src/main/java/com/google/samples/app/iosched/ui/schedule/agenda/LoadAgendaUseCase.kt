package com.google.samples.app.iosched.ui.schedule.agenda

import com.google.samples.app.iosched.shared.data.session.agenda.AgendaRepository
import com.google.samples.app.iosched.shared.model.Block
import com.google.samples.app.iosched.shared.usecases.UseCase
import javax.inject.Inject

open class LoadAgendaUseCase @Inject constructor(
    private val repository: AgendaRepository
) : UseCase<Unit, List<Block>>() {
    override fun execute(parameters: Unit) = repository.getAgenda()
}