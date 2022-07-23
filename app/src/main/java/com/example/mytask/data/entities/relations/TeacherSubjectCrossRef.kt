package com.example.mytask.data.entities.relations

import androidx.room.Entity

@Entity(primaryKeys = ["teacherName","subjectName"])
data class TeacherSubjectCrossRef (

    val teacherName: String,

    val subjectName: String
)