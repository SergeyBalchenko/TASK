package com.example.mytask.data.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.University

data class UniversityWithSubject (

    @Embedded
    val university: University,

    @Relation(
        parentColumn =  "universityName",
        entityColumn = "universityName"
    )
    val subject: List<Subject>
)