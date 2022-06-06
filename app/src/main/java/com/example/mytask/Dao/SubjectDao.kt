package com.example.mytask.Dao

import androidx.room.*
import com.example.mytask.Antity.Subject
import com.example.mytask.Antity.relations.UniversityWithSubject
@Dao
interface SubjectDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Transaction
    @Query("SELECT * FROM university WHERE universityName = :universityName")
    suspend fun getUniversityWithSubject(universityName: String): List<UniversityWithSubject>
}