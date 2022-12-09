package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.Teacher
import com.example.mytask.domain.repository.UniversityRepository

class GetTeacherUseCase(
    private  val universityRepository: UniversityRepository
) {

    suspend fun invoke(): List<Teacher>{
        return  universityRepository.getTeachers()
    }
}