package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.University
import com.example.mytask.domain.repository.UniversityRepository

class GetUniversityUsesCase(
    private val universityRepository: UniversityRepository
) {
    suspend fun invoke(): List<University>{
        return  universityRepository.getUniversity()
    }
}