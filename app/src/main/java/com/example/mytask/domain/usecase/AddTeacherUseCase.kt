package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.Teacher
import com.example.mytask.domain.repository.UniversityRepository

class AddTeacherUseCase(
    private val universityRepository: UniversityRepository
) {

    suspend fun invoke(teacher: Teacher): Result<Unit> {
        return universityRepository.add(teacher)
    }
}