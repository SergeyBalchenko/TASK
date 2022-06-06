package com.example.mytask.Antity.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mytask.Antity.Classroom
import com.example.mytask.Antity.Subject

data class ClassroomWithSubject (
    @Embedded val classroom : Classroom,
    @Relation(
        parentColumn = "classroomName",
        entityColumn = "subjectName",
        associateBy = Junction(ClassroomSubjectCrossRef::class)
    )
    val subjects: List<Subject>
        )