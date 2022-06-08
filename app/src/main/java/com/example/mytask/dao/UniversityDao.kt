package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.*

@Dao
interface UniversityDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUniversity(university: University)
}