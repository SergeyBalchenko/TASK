package com.example.mytask.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mytask.entities.Subject
import com.example.mytask.entities.Teacher

data class TeacherWithSubject (

    @Embedded
    val teacher: Teacher,

    @Relation(
        parentColumn = "teacherName",
        entityColumn = "subjectName",
        associateBy = Junction(TeacherSubjectCrossRef::class)
    )
    val subject: List<Subject>
)