package com.example.mytask.data.dao

import androidx.room.*
import com.example.mytask.data.entities.*
import com.example.mytask.data.entities.relations.UniversityWithSubject

@Dao
interface UniversityDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUniversity(university: University)

    @Query("SELECT * FROM University")
    suspend fun get(): List<University>

    @Transaction
    @Query("SELECT * FROM university WHERE universityName = :universityName")
    suspend fun getUniversityWithSubject(universityName: String): List<UniversityWithSubject>
}