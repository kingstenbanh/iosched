package com.google.samples.app.iosched.tv.ui.schedule

import android.os.Bundle
import android.support.v17.leanback.app.RowsSupportFragment
import android.support.v17.leanback.widget.ArrayObjectAdapter
import android.support.v17.leanback.widget.HeaderItem
import android.support.v17.leanback.widget.ListRow
import android.support.v17.leanback.widget.ListRowPresenter
import android.support.v17.leanback.widget.Presenter
import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.samples.app.iosched.tv.R

class ScheduleFragment : RowsSupportFragment() {

    private val rowsAdapter = ArrayObjectAdapter(ListRowPresenter())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = rowsAdapter

        // TODO: replace with real data
        val dummyAdapter = ArrayObjectAdapter(object: Presenter() {
            override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
                val view = LayoutInflater.from(parent?.context)
                    .inflate(R.layout.card_session, parent, false)

                return ViewHolder(view)
            }

            override fun onBindViewHolder(viewHolder: ViewHolder?, item: Any?) {}

            override fun onUnbindViewHolder(viewHolder: ViewHolder?) {}
        }).apply {
            add("Goodbye World")
        }

        val dummyHeader = HeaderItem(1, "Dummy Header")
        val dummyRow = ListRow(dummyHeader, dummyAdapter)

        rowsAdapter.add(dummyRow)

        mainFragmentAdapter.fragmentHost.notifyDataReady(mainFragmentAdapter)
    }
}