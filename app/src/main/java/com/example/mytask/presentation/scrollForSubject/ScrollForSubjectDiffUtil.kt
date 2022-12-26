package com.example.mytask.presentation.scrollForSubject

import androidx.recyclerview.widget.DiffUtil
import com.example.mytask.data.entities.Subject

class ScrollForSubjectDiffUtil(
): DiffUtil.ItemCallback<Subject>() {

    override fun areItemsTheSame(oldItem: Subject, newItem: Subject): Boolean {
        TODO("Not yet implemented")
    }

    override fun areContentsTheSame(oldItem: Subject, newItem: Subject): Boolean {
        TODO("Not yet implemented")
    }
}