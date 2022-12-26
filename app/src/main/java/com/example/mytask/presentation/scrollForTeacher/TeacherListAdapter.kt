package com.example.mytask.presentation.scrollForTeacher

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.data.entities.Teacher
import com.example.mytask.databinding.ChooseAddedWordBinding


class TeacherListAdapter(
) : ListAdapter<Teacher, TeacherListAdapter.TeacherViewHolder>(
    TeacherDiffUtil()
) {
    var teachers: List<Teacher> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    class TeacherViewHolder(
        val binding: ChooseAddedWordBinding
    ) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChooseAddedWordBinding.inflate(inflater, parent, false)
        return TeacherViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val teacher = teachers[position]
        with(holder.binding){
            text.text = teacher.teacherName
        }
    }
}