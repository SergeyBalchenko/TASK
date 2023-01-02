package com.example.mytask.data.entities.relations

import androidx.room.Entity

@Entity(primaryKeys = ["subjectName","classroomName","teacherName"])
data class SubjectInfoCrossRef(

    val subjectName: String,

    val classroomName: String,

    val teacherName: String
)