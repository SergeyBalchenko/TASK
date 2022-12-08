package com.example.mytask.di.module

import android.content.Context
import com.example.mytask.data.dao.SubjectDao
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

    // TODO: provide other dao
}