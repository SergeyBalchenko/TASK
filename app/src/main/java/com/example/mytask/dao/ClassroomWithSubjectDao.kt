package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.relations.ClassroomSubjectCrossRef
import com.example.mytask.entities.relations.ClassroomWithSubject

@Dao
interface ClassroomWithSubjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClassroomSubjectCrossRef(crossRef: ClassroomSubjectCrossRef)
}