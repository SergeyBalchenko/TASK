package com.example.mytask.data.repository

import com.example.mytask.data.dao.SubjectDao
import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher
import com.example.mytask.domain.repository.UniversityRepository

class UniversityRepositoryRoom(
    private val subjectDao: SubjectDao
): UniversityRepository {

    override suspend fun add(subject: Subject): Result<Unit> {
        return Result.success(subjectDao.insert(subject))
    }

    override suspend fun add(teacher: Teacher): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun add(classroom: Classroom): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun getSubjects(): List<Subject> {
        return subjectDao.get()
    }

    override suspend fun getTeachers(): List<Teacher> {
        TODO("Not yet implemented")
    }

    override suspend fun getClassRooms(): List<Classroom> {
        TODO("Not yet implemented")
    }
}