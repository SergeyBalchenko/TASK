package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.Subject
import com.example.mytask.domain.repository.UniversityRepository

class GetSubjectsUseCase(
    private val universityRepository: UniversityRepository
) {

    suspend fun invoke(): List<Subject> {
        return universityRepository.getSubjects()
    }
}