package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.Classroom
import com.example.mytask.domain.repository.UniversityRepository

class GetClassroomUsesCase(
    private val universityRepository: UniversityRepository
) {
    suspend fun invoke(): List<Classroom>{
        return  universityRepository.getClassRooms()
    }
}