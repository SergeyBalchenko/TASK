package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.Subject
import com.example.mytask.entities.relations.SubjectWithTeacher
import com.example.mytask.entities.relations.UniversityWithSubject
@Dao
interface SubjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun getTeacherOfSubject(subjectName: String): List<SubjectWithTeacher>
}