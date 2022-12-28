package com.example.mytask.presentation.scrollForAuditoria

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.data.entities.Classroom
import com.example.mytask.databinding.ChooseAddedWordBinding
import com.example.mytask.presentation.scrollForTeacher.AuditoriumDiffUtil

class AuditoriumListAdapter(
) : ListAdapter<Classroom, AuditoriumListAdapter.AuditoriumViewHolder>(
    AuditoriumDiffUtil()
) {

    class AuditoriumViewHolder(
        val binding: ChooseAddedWordBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(classroom: Classroom) {
            binding.wordNameTextView.text = classroom.classroomName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuditoriumViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChooseAddedWordBinding.inflate(inflater, parent, false)
        return AuditoriumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AuditoriumViewHolder, position: Int) {
        val auditorium = currentList[position]
        holder.onBind(auditorium)
    }
}