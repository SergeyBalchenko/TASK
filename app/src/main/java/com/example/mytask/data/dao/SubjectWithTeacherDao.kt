package com.example.mytask.data.dao

import androidx.room.*
import com.example.mytask.data.entities.relations.TeacherSubjectCrossRef

@Dao
interface SubjectWithTeacherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacherSubjectCrossRef(crossRef: TeacherSubjectCrossRef)
}

