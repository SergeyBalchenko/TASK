package com.example.mytask.presentation.scrollForTeacher

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.data.entities.Teacher
import com.example.mytask.databinding.ChooseAddedWordBinding

class TeacherListAdapter(

) : ListAdapter<Teacher, TeacherListAdapter.TeacherViewHolder>(
    TeacherDiffUtil()
) {

    class TeacherViewHolder(
        val binding: ChooseAddedWordBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(teacher: Teacher) {
            binding.teacherNameTextView.text = teacher.teacherName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChooseAddedWordBinding.inflate(inflater, parent, false)
        return TeacherViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val teacher = currentList[position]
        holder.onBind(teacher)
    }
}