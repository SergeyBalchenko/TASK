package com.example.mytask.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class University (

    @PrimaryKey(autoGenerate = false)
    val universityName: String
)