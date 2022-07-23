package com.example.mytask.data.dao

import androidx.room.*
import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.relations.ClassroomWithSubject
import com.example.mytask.data.entities.relations.SubjectWithClassroom

@Dao
interface ClassroomDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClassroom(classroom: Classroom)

    @Transaction
    @Query("SELECT * FROM classroom WHERE classroomName =:classroomName")
    suspend fun getClassroomWithSubject(classroomName: String): List<ClassroomWithSubject>

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun getTeacherOfSubject(subjectName: String): List<SubjectWithClassroom>
}