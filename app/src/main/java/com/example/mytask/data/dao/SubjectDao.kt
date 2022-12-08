package com.example.mytask.data.dao

import androidx.room.*
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.relations.SubjectWithTeacher

@Dao
interface SubjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(subject: Subject)

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun getTeacherOfSubject(subjectName: String): List<SubjectWithTeacher>

    @Query("SELECT * FROM Subject")
    suspend fun get(): List<Subject>
}