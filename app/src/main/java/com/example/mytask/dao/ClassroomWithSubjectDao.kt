package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.relations.ClassroomSubjectCrossRef
import com.example.mytask.entities.relations.ClassroomWithSubject

@Dao
interface ClassroomWithSubjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClassroomSubjectCrossRef(crossRef: ClassroomSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun getClassroomOfSubject(subjectName: String): List<ClassroomWithSubject>
}