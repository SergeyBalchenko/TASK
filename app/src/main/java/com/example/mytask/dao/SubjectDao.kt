package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.Subject
import com.example.mytask.entities.relations.UniversityWithSubject
@Dao
interface SubjectDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Transaction
    @Query("SELECT * FROM university WHERE universityName = :universityName")
    suspend fun getUniversityWithSubject(universityName: String): List<UniversityWithSubject>
}