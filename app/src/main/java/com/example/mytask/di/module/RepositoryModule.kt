package com.example.mytask.di.module

import com.example.mytask.data.api.WeatherApi
import com.example.mytask.data.dao.SubjectDao
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
    ): UniversityRepository {
        return UniversityRepositoryRoom(
            subjectDao
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