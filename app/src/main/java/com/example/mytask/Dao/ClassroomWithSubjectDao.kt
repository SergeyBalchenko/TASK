package com.example.mytask.Dao

import androidx.room.*
import com.example.mytask.Antity.relations.ClassroomSubjectCrossRef
import com.example.mytask.Antity.relations.ClassroomWithSubject
import com.example.mytask.Antity.relations.TeacherWithSubject

@Dao
interface ClassroomWithSubjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClassroomSubjectCrossRef(crossRef: ClassroomSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun getClassroomOfSubject(subjectName: String): List<ClassroomWithSubject>
}