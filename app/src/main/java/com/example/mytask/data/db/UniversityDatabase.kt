package com.example.mytask.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mytask.data.entities.*
import com.example.mytask.data.entities.relations.ClassroomSubjectCrossRef
import com.example.mytask.data.entities.relations.TeacherSubjectCrossRef
import com.example.mytask.data.dao.*
import com.example.mytask.data.entities.relations.SubjectInfoCrossRef

@Database(
    entities =[
        University::class,
        Classroom::class,
        Teacher::class,
        Subject::class,
        ClassroomSubjectCrossRef::class,
        TeacherSubjectCrossRef::class,
        SubjectInfoCrossRef::class
    ],
    version = 1,
    exportSchema = false
)
abstract class UniversityDatabase : RoomDatabase() {

    abstract val universityDao: UniversityDao
    abstract val classroomDao: ClassroomDao
    abstract val teacherDao: TeacherDao
    abstract val subjectDao: SubjectDao
    abstract val sWtDao: SubjectWithTeacherDao
    abstract val cWsDao: ClassroomWithSubjectDao
    abstract val subjectInfo: SubjectInfoDao

    companion object {
        @Volatile
        private var INSTANCE: UniversityDatabase? = null

        fun getInstance(context: Context): UniversityDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    UniversityDatabase::class.java,
                    "university_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}