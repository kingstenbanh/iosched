package com.google.samples.app.iosched.ui.schedule.agenda

import android.arch.lifecycle.ViewModelProvider
import android.databinding.BindingAdapter
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.databinding.FragmentScheduleAgendaBinding
import com.google.samples.app.iosched.shared.model.Block
import com.google.samples.app.iosched.shared.util.activityViewModelProvider
import com.google.samples.app.iosched.test.util.clearDecorations
import com.google.samples.app.iosched.ui.schedule.ScheduleViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class ScheduleAgendaFragment: DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: ScheduleViewModel
    private lateinit var binding: FragmentScheduleAgendaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScheduleAgendaBinding.inflate(inflater, container, false).apply {
            setLifecycleOwner(this@ScheduleAgendaFragment)
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = activityViewModelProvider(viewModelFactory)
        binding.viewModel = viewModel
    }
}

@BindingAdapter("agendaItems")
fun agendaItems(recyclerView: RecyclerView, list: List<Block>?) {
    if (recyclerView.adapter == null) {
        recyclerView.adapter = ScheduleAgendaAdapter()
    }

    (recyclerView.adapter as ScheduleAgendaAdapter).submitList(list ?: emptyList())

    // Recreate the decoration used for the sticky date headers
    recyclerView.clearDecorations()
    if (list != null && list.isNotEmpty()) {
        recyclerView.addItemDecoration(
            ScheduleAgendaHeadersDecoration(recyclerView.context, list)
        )
    }
}