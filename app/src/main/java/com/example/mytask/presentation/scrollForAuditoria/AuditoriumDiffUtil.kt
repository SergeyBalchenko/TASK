package com.example.mytask.presentation.scrollForTeacher

import androidx.recyclerview.widget.DiffUtil
import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher

class AuditoriumDiffUtil(
): DiffUtil.ItemCallback<Classroom>(

) {

    override fun areItemsTheSame(oldItem: Classroom, newItem: Classroom): Boolean {
        return  oldItem.classroomName == newItem.classroomName
    }

    override fun areContentsTheSame(oldItem: Classroom, newItem: Classroom): Boolean {
        return oldItem == newItem
    }
}