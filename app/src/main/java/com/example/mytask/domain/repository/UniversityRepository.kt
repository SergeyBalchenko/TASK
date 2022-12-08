package com.example.mytask.domain.repository

import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher

interface UniversityRepository {

    suspend fun add(subject: Subject): Result<Unit>

    suspend fun add(teacher: Teacher): Result<Unit>

    suspend fun add(classroom: Classroom): Result<Unit>

    suspend fun getSubjects(): List<Subject>

    suspend fun getTeachers(): List<Teacher>

    suspend fun getClassRooms(): List<Classroom>
}