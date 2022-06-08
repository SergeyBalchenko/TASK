package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.relations.TeacherSubjectCrossRef
import com.example.mytask.entities.relations.TeacherWithSubject
@Dao
interface SubjectWithTeacherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacherSubjectCrossRef(crossRef: TeacherSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM teacher WHERE teacherName = :teacherName")
    suspend fun getSubjectsOfTeacher(teacherName: String): List<TeacherWithSubject>
}