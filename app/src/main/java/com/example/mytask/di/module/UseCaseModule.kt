package com.example.mytask.di.module

import com.example.mytask.domain.repository.UniversityRepository
import com.example.mytask.domain.repository.WeatherRepository
import com.example.mytask.domain.usecase.AddSubjectUseCase
import com.example.mytask.domain.usecase.AddTeacherUseCase
import com.example.mytask.domain.usecase.GetSubjectsUseCase
import com.example.mytask.domain.usecase.GetTemperatureUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideAddSubjectUseCase(
        universityRepository: UniversityRepository
    ): AddSubjectUseCase {
        return AddSubjectUseCase(
            universityRepository
        )
    }

    @Provides
    fun provideAddTeacherUseCase(
        universityRepository: UniversityRepository
    ): AddTeacherUseCase {
        return AddTeacherUseCase(
            universityRepository
        )
    }

    @Provides
    fun provideGetSubjectsUseCase(
        universityRepository: UniversityRepository
    ): GetSubjectsUseCase {
        return GetSubjectsUseCase(
            universityRepository
        )
    }

    @Provides
    fun provideGetTemperatureUseCase(
        weatherRepository: WeatherRepository
    ): GetTemperatureUseCase {
        return GetTemperatureUseCase(
            weatherRepository
        )
    }
}