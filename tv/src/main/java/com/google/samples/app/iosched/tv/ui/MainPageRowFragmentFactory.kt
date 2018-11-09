package com.google.samples.app.iosched.tv.ui

import android.support.v17.leanback.app.BrowseSupportFragment
import android.support.v17.leanback.widget.Row
import com.google.samples.app.iosched.shared.util.TimeUtils
import com.google.samples.app.iosched.tv.ui.schedule.ScheduleFragment

class MainPageRowFragmentFactory : BrowseSupportFragment.FragmentFactory<ScheduleFragment>() {

    override fun createFragment(rowObj: Any?): ScheduleFragment {
        val row = rowObj as Row
        return when (row.headerItem.id) {
            TimeUtils.ConferenceDay.DAY_1.ordinal.toLong(),
            TimeUtils.ConferenceDay.DAY_2.ordinal.toLong(),
            TimeUtils.ConferenceDay.DAY_3.ordinal.toLong(),
            TimeUtils.ConferenceDay.PRECONFERENCE_DAY.ordinal.toLong() -> ScheduleFragment()
            else -> throw IllegalArgumentException("Invalid row $rowObj")
        }
    }
}