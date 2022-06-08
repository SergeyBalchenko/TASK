package com.example.mytask.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Classroom (

    @PrimaryKey
    val classroomName: String,

    @ColumnInfo
    val  locationName: String
)