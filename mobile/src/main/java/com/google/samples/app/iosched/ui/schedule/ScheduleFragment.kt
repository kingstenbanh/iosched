package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.ViewModelProvider
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.databinding.FragmentScheduleBinding
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay
import com.google.samples.app.iosched.shared.util.viewModelProvider
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_schedule.*
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject

/**
 * The Schedule page of the top-level Activity.
 */
class ScheduleFragment : DaggerFragment() {

    companion object {
        val TAG: String? = ScheduleFragment::class.java.simpleName
        val COUNT = ConferenceDay.values().size
    }

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: ScheduleViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = viewModelProvider(viewModelFactory)

        val binding: FragmentScheduleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_schedule, container, false
        )

        // Set the layout variables
        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toolbar.setTitle(R.string.title_schedule)
        viewpager.offscreenPageLimit = COUNT - 1
        viewpager.adapter = ScheduleAdapter(childFragmentManager)
        tabs.setupWithViewPager(viewpager)
    }

    /**
     * Adapter that build a page for each conference day.
     */
    inner class ScheduleAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getCount(): Int = COUNT

        override fun getItem(position: Int): Fragment {
            return ScheduleDayFragment.newInstance(ConferenceDay.values()[position])
        }

        override fun getPageTitle(position: Int): CharSequence {
            return ConferenceDay.values()[position].formatMonthDay()
        }
    }
}