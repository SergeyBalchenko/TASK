package com.example.mytask.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Classroom(

    @PrimaryKey(autoGenerate = false)
    val classroomName: String
)