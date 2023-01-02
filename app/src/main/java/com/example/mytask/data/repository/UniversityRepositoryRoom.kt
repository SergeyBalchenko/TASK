package com.example.mytask.data.repository

import com.example.mytask.data.dao.ClassroomDao
import com.example.mytask.data.dao.SubjectDao
import com.example.mytask.data.dao.SubjectInfoDao
import com.example.mytask.data.dao.TeacherDao
import com.example.mytask.data.dao.UniversityDao
import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher
import com.example.mytask.data.entities.University
import com.example.mytask.data.entities.relations.SubjectInfoCrossRef
import com.example.mytask.domain.repository.UniversityRepository

class UniversityRepositoryRoom(
    private val subjectDao: SubjectDao,
    private val universityDao: UniversityDao,
    private  val teacherDao: TeacherDao,
    private val classroomDao: ClassroomDao,
    private val subjectInfoDao: SubjectInfoDao
): UniversityRepository {

    override suspend fun add(subject: Subject): Result<Unit> {
        return Result.success(subjectDao.insert(subject))
    }

    override suspend fun add(teacher: Teacher): Result<Unit> {
        return  Result.success(teacherDao.insertTeacher(teacher))
    }

    override suspend fun add(classroom: Classroom): Result<Unit> {
        return  Result.success(classroomDao.insertClassroom(classroom))
    }

    override suspend fun add(subjectInfoCrossRef: SubjectInfoCrossRef): Result<Unit> {
        return  Result.success(subjectInfoDao.insertSubjectInfoCrossRef(subjectInfoCrossRef))
    }

    override suspend fun getSubjectInfo(): List<SubjectInfoCrossRef> {
        return subjectInfoDao.get()
    }

    override suspend fun getUniversity(): List<University> {
        return  universityDao.get()
    }

    override suspend fun add(university: University): Result<Unit> {
        return  Result.success(universityDao.insertUniversity(university))
    }

    override suspend fun getSubjects(): List<Subject> {
        return subjectDao.get()
    }

    override suspend fun getTeachers(): List<Teacher> {
        return  teacherDao.get()
    }

    override suspend fun getClassRooms(): List<Classroom> {
        return  classroomDao.getClassroom()
    }
}