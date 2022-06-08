package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.Teacher
import com.example.mytask.entities.relations.SubjectWithTeacher

@Dao
interface TeacherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacher(teacher: Teacher)

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun getTeacherOfSubject(subjectName: String): List<SubjectWithTeacher>
}