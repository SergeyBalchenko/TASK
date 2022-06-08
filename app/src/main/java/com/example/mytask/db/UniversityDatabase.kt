package com.example.mytask.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mytask.entities.*
import com.example.mytask.entities.relations.ClassroomSubjectCrossRef
import com.example.mytask.entities.relations.TeacherSubjectCrossRef
import com.example.mytask.dao.*

@Database(
    entities =[
        University::class,
        Classroom::class,
        Teacher::class,
        Subject::class,
        ClassroomSubjectCrossRef::class,
        TeacherSubjectCrossRef::class
    ],
    version = 1
)
abstract class UniversityDatabase : RoomDatabase() {

    abstract val universityDao: UniversityDao
    abstract val classroomDao: ClassroomDao
    abstract val teacherDao: TeacherDao
    abstract val subjectDao: SubjectDao
    abstract val sWtDao: SubjectWithTeacherDao
    abstract val cWsDao: ClassroomWithSubjectDao

    companion object {
        @Volatile
        private var INSTANCE: UniversityDatabase? = null

        fun getInstance(context: Context): UniversityDatabase {
            synchronized(this){
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