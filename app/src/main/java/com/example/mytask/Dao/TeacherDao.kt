package com.example.mytask.Dao

import androidx.room.*
import com.example.mytask.Antity.Teacher
import com.example.mytask.Antity.relations.SubjectWithTeacher

@Dao
interface TeacherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacher(teacher: Teacher)

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun getTeacherOfSubject(subjectName: String): List<SubjectWithTeacher>
}