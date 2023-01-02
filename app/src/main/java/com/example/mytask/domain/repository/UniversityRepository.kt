package com.example.mytask.domain.repository

import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher
import com.example.mytask.data.entities.University
import com.example.mytask.data.entities.relations.SubjectInfoCrossRef

interface UniversityRepository {

    suspend fun add(university: University): Result<Unit>
    suspend fun add(subject: Subject): Result<Unit>
    suspend fun add(teacher: Teacher): Result<Unit>
    suspend fun add(classroom: Classroom): Result<Unit>
    suspend fun add(subjectInfoCrossRef: SubjectInfoCrossRef): Result<Unit>
    suspend fun getSubjectInfo(): List<SubjectInfoCrossRef>
    suspend fun getUniversity(): List<University>
    suspend fun getSubjects(): List<Subject>
    suspend fun getTeachers(): List<Teacher>
    suspend fun getClassRooms(): List<Classroom>
}