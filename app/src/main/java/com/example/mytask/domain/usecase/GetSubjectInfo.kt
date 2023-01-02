package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.relations.SubjectInfoCrossRef
import com.example.mytask.domain.repository.UniversityRepository

class GetSubjectInfo(
    private val universityRepository: UniversityRepository
) {
    suspend fun invoke(): List<SubjectInfoCrossRef>{
        return  universityRepository.getSubjectInfo()
    }
}