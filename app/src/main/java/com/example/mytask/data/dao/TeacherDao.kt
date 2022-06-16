package com.example.mytask.data.dao

import androidx.room.*
import com.example.mytask.data.entities.Teacher
import com.example.mytask.data.entities.relations.TeacherWithSubject

@Dao
interface TeacherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacher(teacher: Teacher)

    @Transaction
    @Query("SELECT * FROM teacher WHERE teacherName = :teacherName")
    suspend fun getSubjectsOfTeacher(teacherName: String): List<TeacherWithSubject>
}
