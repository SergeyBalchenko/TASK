package com.example.mytask.di.module

import com.example.mytask.data.api.WeatherApi
import com.example.mytask.data.dao.ClassroomDao
import com.example.mytask.data.dao.SubjectDao
import com.example.mytask.data.dao.TeacherDao
import com.example.mytask.data.dao.UniversityDao
import com.example.mytask.data.repository.UniversityRepositoryRoom
import com.example.mytask.data.repository.WeatherRepositoryRemote
import com.example.mytask.domain.repository.UniversityRepository
import com.example.mytask.domain.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideUniversityRepository(
        subjectDao: SubjectDao,
        universityDao: UniversityDao,
        teacherDao: TeacherDao,
        classroomDao: ClassroomDao
    ): UniversityRepository {
        return UniversityRepositoryRoom(
            subjectDao,
            universityDao,
            teacherDao,
            classroomDao
        )
    }

    @Provides
    @Singleton
    fun provideWeatherRepository(
        weatherApi: WeatherApi
    ): WeatherRepository {
        return WeatherRepositoryRemote(
            weatherApi
        )
    }
}