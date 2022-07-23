package com.example.mytask.data.entities.relations

import androidx.room.Entity

@Entity (primaryKeys = ["classroomName","subjectName"])
data class ClassroomSubjectCrossRef (

    val classroomName: String,

    val subjectName: String
)