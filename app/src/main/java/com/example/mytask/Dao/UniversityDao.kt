package com.example.mytask.Dao

import androidx.room.*
import com.example.mytask.Antity.*
import com.example.mytask.Antity.relations.*
@Dao
interface UniversityDao{






    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUniversity(university: University)











}