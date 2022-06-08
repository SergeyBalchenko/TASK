package com.example.mytask.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Teacher (
    @PrimaryKey
    val teacherName: String,
    @ColumnInfo
    val teacherPhone: String,
    @ColumnInfo
    val teacherAge: Int
        )