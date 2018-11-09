package com.google.samples.app.iosched.ui.schedule

import android.content.res.ColorStateList
import android.support.v4.view.ViewCompat
import android.support.v7.widget.RecyclerView.ViewHolder
import android.support.v7.widget.RecyclerView.Adapter
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.util.inflate
import com.google.samples.app.iosched.ui.schedule.ScheduleFilterAdapter.FilterViewHolder

/**
 * Adapter for the filters drawer
 */
class ScheduleFilterAdapter(
    val viewModel: ScheduleViewModel
) : Adapter<FilterViewHolder>() {

    private var tags: List<Tag> = emptyList()

    override fun getItemCount() = tags.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        FilterViewHolder(parent.inflate(R.layout.list_item_filter_drawer, false))

    override fun onBindViewHolder(holder: FilterViewHolder, position: Int) {
        holder.bind(tags[position])
    }

    fun clearFilters() {
        viewModel.clearFilters()
    }

    inner class FilterViewHolder(itemView: View): ViewHolder(itemView) {

        private val label: TextView = itemView.findViewById(R.id.filter_label)
        private val checkbox: CheckBox = itemView.findViewById(R.id.filter_checkbox)

        private var tag: Tag? = null

        init {
            itemView.setOnClickListener {
                // TODO: move to Data Binding
                checkbox.performClick()

                if (tag != null) {
                    viewModel.toggleFilter(tag!!, checkbox.isChecked)
                }
            }
        }

        // TODO(jdkoren): add databinding
        internal fun bind(tag: Tag) {
            this.tag = tag
            label.text = tag.name
            ViewCompat.setBackgroundTintList(label, ColorStateList.valueOf(tag.color))
        }
    }

    fun setItems(list: List<Tag>) {
        // TODO(jdkoren) use DiffUtil
        // TODO(jdkoren) reconcile new tags with current filters
        tags = list
        notifyDataSetChanged()
    }
}

