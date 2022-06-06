package com.example.mytask.Antity.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mytask.Antity.Subject
import com.example.mytask.Antity.Teacher

data class TeacherWithSubject (
    @Embedded val teacher: Teacher,
    @Relation(
        parentColumn = "teacherName",
        entityColumn = "subjectName",
        associateBy = Junction(TeacherSubjectCrossRef::class)
    )
    val subject: List<Subject>
        )