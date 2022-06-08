package com.example.mytask.dao

import androidx.room.*
import com.example.mytask.entities.relations.TeacherSubjectCrossRef
import com.example.mytask.entities.relations.TeacherWithSubject
@Dao
interface SubjectWithTeacherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacherSubjectCrossRef(crossRef: TeacherSubjectCrossRef)
}

