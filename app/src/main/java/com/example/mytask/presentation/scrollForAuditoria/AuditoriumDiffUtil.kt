package com.example.mytask.presentation.scrollForTeacher

import androidx.recyclerview.widget.DiffUtil
import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher

class AuditoriumDiffUtil(
): DiffUtil.ItemCallback<Classroom>(

) {

    override fun areItemsTheSame(oldItem: Classroom, newItem: Classroom): Boolean {
        TODO("Not yet implemented")
    }

    override fun areContentsTheSame(oldItem: Classroom, newItem: Classroom): Boolean {
        TODO("Not yet implemented")
    }
}


//class TeachersDiffCallback(
//
//): DiffUtil.Callback(){
//    override fun getOldListSize(): Int = oldList.size
//
//    override fun getNewListSize(): Int = newList.size
//
//    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
//        val oldTeacher = oldList[oldItemPosition]
//        val newTeacher = newList[newItemPosition]
//        return oldTeacher.teacherName == newTeacher.teacherName
//    }
//
//    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
//        val oldTeacher = oldList[oldItemPosition]
//        val newTeacher = newList[newItemPosition]
//        return oldTeacher == newTeacher
//    }
//}