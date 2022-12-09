package com.example.mytask.di.module

import android.content.Context
import com.example.mytask.data.dao.ClassroomDao
import com.example.mytask.data.dao.SubjectDao
import com.example.mytask.data.dao.TeacherDao
import com.example.mytask.data.dao.UniversityDao
import com.example.mytask.data.db.UniversityDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {

    @Provides
    @Singleton
    fun provideUniversityDatabase(
        context: Context
    ): UniversityDatabase {
        return UniversityDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideSubjectDao(
        database: UniversityDatabase
    ): SubjectDao {
        return database.subjectDao
    }

    @Provides
    @Singleton
    fun provideTeacherDao(
        database: UniversityDatabase
    ): TeacherDao {
        return  database.teacherDao
    }

    @Provides
    @Singleton
        fun provideClassroomDao(
        database: UniversityDatabase
        ): ClassroomDao{
            return  database.classroomDao
        }

    @Provides
    @Singleton
            fun provideUniversityDao(
            database: UniversityDatabase
            ): UniversityDao{
                return  database.universityDao
            }
}