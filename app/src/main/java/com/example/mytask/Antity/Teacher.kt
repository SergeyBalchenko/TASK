package com.example.mytask.Antity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Teacher (
    @PrimaryKey
    val teacherName: String,
    val teacherPhone: String,
    val teacherAge: Int
        )