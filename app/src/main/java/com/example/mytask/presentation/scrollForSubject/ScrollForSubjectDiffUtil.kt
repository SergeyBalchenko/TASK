package com.example.mytask.presentation.scrollForSubject

import androidx.recyclerview.widget.DiffUtil
import com.example.mytask.data.entities.Subject

class ScrollForSubjectDiffUtil(
): DiffUtil.ItemCallback<Subject>() {

    override fun areItemsTheSame(oldItem: Subject, newItem: Subject): Boolean {
        return oldItem.subjectName == newItem.subjectName
    }

    override fun areContentsTheSame(oldItem: Subject, newItem: Subject): Boolean {
        return  oldItem == newItem
    }
}