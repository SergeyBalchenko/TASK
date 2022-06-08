package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.*
import com.example.mytask.entities.relations.UniversityWithSubject

@Dao
interface UniversityDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUniversity(university: University)

    @Transaction
    @Query("SELECT * FROM university WHERE universityName = :universityName")
    suspend fun getUniversityWithSubject(universityName: String): List<UniversityWithSubject>
}