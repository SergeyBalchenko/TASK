package com.example.mytask.data.dao

import androidx.room.*
import com.example.mytask.data.entities.relations.ClassroomSubjectCrossRef

@Dao
interface ClassroomWithSubjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClassroomSubjectCrossRef(crossRef: ClassroomSubjectCrossRef)
}