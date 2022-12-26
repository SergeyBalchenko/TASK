package com.example.mytask.presentation.scrollForTeacher

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.data.entities.Classroom
import com.example.mytask.databinding.ChooseAddedWordBinding


class AuditoriumListAdapter(
) : ListAdapter<Classroom, AuditoriumListAdapter.AuditoriumViewHolder>(
    AuditoriumDiffUtil()
) {
    var auditorium: List<Classroom> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    class AuditoriumViewHolder(
        val binding: ChooseAddedWordBinding
    ) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuditoriumViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChooseAddedWordBinding.inflate(inflater, parent, false)
        return AuditoriumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AuditoriumViewHolder, position: Int) {
        val auditorium = auditorium[position]
        with(holder.binding){
            text.text = auditorium.classroomName
        }
    }
}