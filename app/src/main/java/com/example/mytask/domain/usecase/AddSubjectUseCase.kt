package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.Subject
import com.example.mytask.domain.repository.UniversityRepository

class AddSubjectUseCase(
    private val universityRepository: UniversityRepository
) {

    suspend fun invoke(subject: Subject): Result<Unit> {
        return universityRepository.add(subject)
    }
}