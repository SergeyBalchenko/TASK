package com.example.mytask.domain.usecase

import com.example.mytask.data.entities.relations.SubjectInfoCrossRef
import com.example.mytask.domain.repository.UniversityRepository

class AddSubjectInfo(
    private val subjectInfoRepository: UniversityRepository
) {

    suspend fun invoke(subjectInfo: SubjectInfoCrossRef): Result<Unit> {
        return subjectInfoRepository.add(subjectInfo)
    }
}