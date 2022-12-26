package com.example.mytask.presentation.scrollForTeacher

import androidx.recyclerview.widget.DiffUtil
import com.example.mytask.data.entities.Teacher

class TeacherDiffUtil(
) : DiffUtil.ItemCallback<Teacher>(

) {
    override fun areItemsTheSame(oldItem: Teacher, newItem: Teacher): Boolean {
        return oldItem.teacherName == newItem.teacherName
    }

    override fun areContentsTheSame(oldItem: Teacher, newItem: Teacher): Boolean {
        return oldItem == newItem
    }
}