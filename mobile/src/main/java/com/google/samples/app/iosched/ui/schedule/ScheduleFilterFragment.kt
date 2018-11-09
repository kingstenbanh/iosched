package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.OnScrollListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.shared.util.activityViewModelProvider
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_schedule_filter.*
import javax.inject.Inject

/**
 * Fragment that shows the list of filters for the Schedule
 */
class ScheduleFilterFragment: DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: ScheduleViewModel
    private lateinit var filterAdapter: ScheduleFilterAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_schedule_filter, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = activityViewModelProvider(viewModelFactory)
        filterAdapter = ScheduleFilterAdapter(viewModel)
        viewModel.tags.observe(this, Observer { list ->
            filterAdapter.setItems(list ?: emptyList())
        })

        clear_filters.setOnClickListener { filterAdapter.clearFilters() }
        recyclerview.apply {
            adapter = filterAdapter
            setHasFixedSize(true)
            addOnScrollListener(object: OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    filters_header.isActivated = recyclerView.canScrollVertically(-1)
                }
            })
        }
    }
}