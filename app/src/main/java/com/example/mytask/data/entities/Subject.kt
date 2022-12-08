package com.example.mytask.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subject (

    @PrimaryKey(autoGenerate = false)
    val subjectName: String,

    val universityName: String
)