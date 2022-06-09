package com.example.mytask.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mytask.entities.Classroom
import com.example.mytask.entities.Subject

data class SubjectWithClassroom(

    @Embedded
    val subject: Subject,

    @Relation(
        parentColumn = "subjectName",
        entityColumn = "classroomName",
        associateBy = Junction(ClassroomSubjectCrossRef::class)
    )
    val classroom: List<Classroom>
)
