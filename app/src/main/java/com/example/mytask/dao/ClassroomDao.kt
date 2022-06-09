package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.Classroom
import com.example.mytask.entities.relations.ClassroomWithSubject
import com.example.mytask.entities.relations.SubjectWithClassroom
import com.example.mytask.entities.relations.SubjectWithTeacher

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