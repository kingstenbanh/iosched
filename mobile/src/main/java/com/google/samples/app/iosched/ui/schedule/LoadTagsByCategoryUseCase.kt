package com.google.samples.app.iosched.ui.schedule

import com.google.samples.app.iosched.shared.data.tag.TagRepository
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.usecases.repository.LoadTagsUseCase
import javax.inject.Inject

open class LoadTagsByCategoryUseCase @Inject constructor(repository: TagRepository)
    : LoadTagsUseCase(repository) {

    override fun execute(parameters: Unit): List<Tag> {
        return super.execute(parameters)
            .sortedWith(compareBy<Tag> { it.category }
            .thenBy { it.orderInCategory })
    }

}