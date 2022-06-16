package com.example.mytask.data.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.Subject

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
