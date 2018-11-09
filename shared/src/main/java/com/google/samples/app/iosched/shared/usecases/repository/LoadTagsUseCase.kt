package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.tag.TagRepository
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.usecases.UseCase
import javax.inject.Inject

/**
 * TODO: Example use case that simulates a delay.
 */
open class LoadTagsUseCase @Inject constructor(private val repository: TagRepository)
    : UseCase<Unit, List<Tag>>() {

    override fun execute(parameters: Unit): List<Tag> {
        Thread.sleep(1000)
        return repository.getTags()
    }
}