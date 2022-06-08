package com.example.mytask.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mytask.entities.Subject
import com.example.mytask.entities.Teacher

data class SubjectWithTeacher (

    @Embedded
    val subject: Subject,

    @Relation(
        parentColumn = "subjectName",
        entityColumn = "teacherName",
        associateBy = Junction(TeacherSubjectCrossRef::class)
    )
    val teacher: List<Teacher>
)