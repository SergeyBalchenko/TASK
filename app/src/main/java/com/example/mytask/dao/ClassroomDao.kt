package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.Classroom
import com.example.mytask.entities.relations.ClassroomWithSubject

@Dao
interface ClassroomDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClassroom(classroom: Classroom)

    @Transaction
    @Query("SELECT * FROM classroom WHERE classroomName =:classroomName")
    suspend fun getClassroomWithSubject(classroomName: String): List<ClassroomWithSubject>
}