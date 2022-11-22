package com.example.mytask.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.data.entities.Teacher
import com.example.mytask.databinding.FragmentViewInfoTeacherBinding

class UsersAdapter(
    private val teachers: List<Teacher>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int = teachers.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FragmentViewInfoTeacherBinding.inflate(inflater, parent, false)
        return UsersViewHolder((binding))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is UsersViewHolder -> holder.bindData(teachers[position])
        }
    }

    class UsersViewHolder(
        val binding: FragmentViewInfoTeacherBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(teacher: Teacher) {
            binding.nameTeacher.text = teacher.teacherName
            binding.teacherAge.id = teacher.teacherAge
            binding.teacherPhoneNumber.text = teacher.teacherPhone
        }
    }

}