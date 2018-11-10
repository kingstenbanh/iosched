package com.google.samples.app.iosched.ui.schedule.agenda

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.samples.app.iosched.BR
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.shared.model.Block

class ScheduleAgendaAdapter : ListAdapter<Block, AgendaViewHolder>(BlockDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgendaViewHolder {
        return AgendaViewHolder(
            DataBindingUtil.inflate(LayoutInflater.from(parent.context), viewType, parent, false))
    }

    override fun onBindViewHolder(holder: AgendaViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return if (getItem(position).isDark) {
            R.layout.item_agenda_dark
        } else {
            R.layout.item_agenda_light
        }
    }
}

class AgendaViewHolder(
    private val binding: ViewDataBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(block: Block) {
        binding.run {
            setVariable(BR.agenda, block)
            executePendingBindings()
        }
    }
}

object BlockDiff : DiffUtil.ItemCallback<Block>() {
    override fun areItemsTheSame(oldItem: Block, newItem: Block): Boolean {
        return oldItem.title == newItem.title
            && oldItem.startTime == newItem.startTime
            && oldItem.endTime == newItem.endTime
    }

    override fun areContentsTheSame(oldItem: Block, newItem: Block) = oldItem == newItem
}