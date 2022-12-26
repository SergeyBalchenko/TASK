package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.Classroom
import com.example.mytask.domain.repository.UniversityRepository

class GetClassroomUsesCase(
    private val classroomRepository: UniversityRepository
) {
    suspend fun invoke(): List<Classroom>{
        return  classroomRepository.getClassRooms()
    }
}