package com.example.mytask.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytask.data.entities.Teacher
import com.example.mytask.databinding.FragmentViewInfoTeacherBinding

class UsersAdapter : RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {

    var  teachers : List<Teacher> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }
    override fun getItemCount(): Int = teachers.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FragmentViewInfoTeacherBinding.inflate(inflater,parent,false)
        return UsersViewHolder((binding))
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
       val teacher = teachers[position]
        with(holder.binding){
            nameTeacher.text = teacher.teacherName
            teacherAge.id = teacher.teacherAge
            teacherPhoneNumber.text = teacher.teacherPhone

        }
    }

    class UsersViewHolder(
    val binding: FragmentViewInfoTeacherBinding
    ) : RecyclerView.ViewHolder(binding.root)

}