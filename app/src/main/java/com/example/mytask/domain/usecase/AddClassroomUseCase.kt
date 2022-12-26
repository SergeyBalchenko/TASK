package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.University
import com.example.mytask.domain.repository.UniversityRepository

class AddClassroomUseCase(
    private val classroomRepository: UniversityRepository
) {

    suspend fun invoke(classroom: Classroom): Result<Unit> {
        return classroomRepository.add(classroom)
    }
}