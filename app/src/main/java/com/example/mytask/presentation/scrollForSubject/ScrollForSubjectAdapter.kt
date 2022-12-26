package com.example.mytask.presentation.scrollForSubject

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.data.entities.Subject import com.example.mytask.databinding.ChooseAddedWordBinding

class ScrollForSubjectAdapter(
    ) : ListAdapter<Subject, ScrollForSubjectAdapter.SubjectViewHolder>(
   ScrollForSubjectDiffUtil()
    ) {
        var subject: List<Subject> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

        class SubjectViewHolder(
            val binding: ChooseAddedWordBinding
        ) : RecyclerView.ViewHolder(binding.root) {

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ChooseAddedWordBinding.inflate(inflater, parent, false)
            return SubjectViewHolder(binding)
        }

        override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
            val subject = subject[position]
            with(holder.binding){
                text.text = subject.subjectName
            }
        }
    }