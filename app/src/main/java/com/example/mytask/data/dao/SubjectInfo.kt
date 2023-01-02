package com.example.mytask.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mytask.data.entities.relations.SubjectInfoCrossRef

@Dao
interface SubjectInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubjectInfoCrossRef(crossRef: SubjectInfoCrossRef)

    @Query("SELECT * FROM SubjectInfoCrossRef")
    suspend fun get(): List<SubjectInfoCrossRef>
}