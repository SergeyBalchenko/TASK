package com.example.mytask.Antity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class University (
    @PrimaryKey(autoGenerate = false)
    val universityName: String
        )