package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.University
import com.example.mytask.domain.repository.UniversityRepository

class AddUniversityUseCase(
    private val universityRepository: UniversityRepository
) {

    suspend fun invoke(university: University): Result<Unit> {
        return universityRepository.add(university)
    }
}