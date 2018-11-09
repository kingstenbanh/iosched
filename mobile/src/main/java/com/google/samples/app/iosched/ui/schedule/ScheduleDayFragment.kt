package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay
import com.google.samples.app.iosched.shared.util.getEnum
import com.google.samples.app.iosched.shared.util.lazyFast
import com.google.samples.app.iosched.shared.util.parentViewModelProvider
import com.google.samples.app.iosched.shared.util.putEnum
import com.google.samples.app.iosched.util.clearDecorations
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_schedule_day.*
import javax.inject.Inject

class ScheduleDayFragment : DaggerFragment() {

    companion object {
        private const val TAG = "ScheduleDayFragment"
        private const val ARG_CONFERENCE_DAY = "arg.CONFERENCE_DAY"

        fun newInstance(day: ConferenceDay): ScheduleDayFragment {
            val args = Bundle().apply {
                putEnum(ARG_CONFERENCE_DAY, day)
            }
            return ScheduleDayFragment().apply { arguments = args }
        }
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: ScheduleViewModel

    private val conferenceDay: ConferenceDay by lazyFast {
        val args = arguments ?: throw IllegalStateException("Missing arguments!")
        args.getEnum<ConferenceDay>(ARG_CONFERENCE_DAY)
    }

    private lateinit var adapter: ScheduleDayAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_schedule_day, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = parentViewModelProvider(viewModelFactory)
        adapter = ScheduleDayAdapter(viewModel)
        recyclerview.adapter = adapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.getSessionsForDay(conferenceDay).observe(this, Observer { list ->
            adapter.setList(list ?: emptyList())

            // Recreate the decoration used for the sticky time headers
            recyclerview.clearDecorations()
            if (list != null && list.isNotEmpty()) {
                recyclerview.addItemDecoration(
                    ScheduleTimeHeadersDecoration(recyclerview.context, list)
                )
            }
        })

        // Show an error message
        viewModel.errorMessage.observe(this, Observer { message ->
            // TODO: Change once there's a way to show errors to the user
            if (!message.isNullOrEmpty() && !viewModel.wasErrorMessageShown()) {
                // Prevent the message from showing more than once
                viewModel.onErrorMessageShown()
                Toast.makeText(this.context, message, Toast.LENGTH_LONG).show()
            }
        })
    }
}
