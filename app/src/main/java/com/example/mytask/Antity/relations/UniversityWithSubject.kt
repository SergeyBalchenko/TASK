package com.example.mytask.Antity.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.mytask.Antity.Subject
import com.example.mytask.Antity.University

data class UniversityWithSubject (
    @Embedded val university: University,
    @Relation(
        parentColumn =  "universityName",
        entityColumn = "universityName"
    )
    val subject: List<Subject>
        )