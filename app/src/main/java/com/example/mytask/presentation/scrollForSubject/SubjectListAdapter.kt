package com.example.mytask.presentation.scrollForSubject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.data.entities.Subject
import com.example.mytask.databinding.ChooseAddedWordBinding

class SubjectListAdapter(
) : ListAdapter<Subject, SubjectListAdapter.SubjectViewHolder>(
    ScrollForSubjectDiffUtil()
) {

    class SubjectViewHolder(
        val binding: ChooseAddedWordBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(subject: Subject) {
            binding.wordNameTextView.text = subject.subjectName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChooseAddedWordBinding.inflate(inflater, parent, false)
        return SubjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        val subject = currentList[position]
        holder.onBind(subject)
    }
}