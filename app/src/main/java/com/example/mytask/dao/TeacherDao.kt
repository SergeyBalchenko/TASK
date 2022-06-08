package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.Teacher
import com.example.mytask.entities.relations.SubjectWithTeacher
import com.example.mytask.entities.relations.TeacherWithSubject

@Dao
interface TeacherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacher(teacher: Teacher)

    @Transaction
    @Query("SELECT * FROM teacher WHERE teacherName = :teacherName")
    suspend fun getSubjectsOfTeacher(teacherName: String): List<TeacherWithSubject>
}
