package com.example.mytask.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mytask.entities.Classroom
import com.example.mytask.entities.Subject

data class ClassroomWithSubject(

    @Embedded
    val classroom: Classroom,

    @Relation(
        parentColumn = "classroomName",
        entityColumn = "subjectName",
        associateBy = Junction(ClassroomSubjectCrossRef::class)
    )
    val subject: List<Subject>
)
