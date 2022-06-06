package com.example.mytask.Dao

import androidx.room.*
import com.example.mytask.Antity.relations.TeacherSubjectCrossRef
import com.example.mytask.Antity.relations.TeacherWithSubject
@Dao
interface SubjectWithTeacherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacherSubjectCrossRef(crossRef: TeacherSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM teacher WHERE teacherName = :teacherName")
    suspend fun getSubjectsOfTeacher(teacherName: String): List<TeacherWithSubject>
}