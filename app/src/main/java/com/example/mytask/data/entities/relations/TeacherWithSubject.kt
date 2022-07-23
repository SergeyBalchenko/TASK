package com.example.mytask.data.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher

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