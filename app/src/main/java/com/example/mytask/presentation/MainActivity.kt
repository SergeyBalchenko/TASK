package com.example.mytask.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.mytask.R
import com.example.mytask.data.db.UniversityDatabase
import com.example.mytask.data.entities.Classroom
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher
import com.example.mytask.data.entities.University
import com.example.mytask.data.entities.relations.ClassroomSubjectCrossRef
import com.example.mytask.data.entities.relations.TeacherSubjectCrossRef
import com.example.mytask.databinding.ActivityMainBinding
import com.example.mytask.presentation.welcome.WelcomeFragment
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding
   private lateinit var adapter: UsersAdapter
   private lateinit var mainViewModel: MainActyvityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = UsersAdapter(
            listOf(
                Teacher("Serega", "066", 10),
                Teacher("Serega", "066", 10),
                Teacher("Serega", "066", 10),
                Teacher("Serega", "066", 10),
                Teacher("Serega", "066", 10),
            )
        )

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, WelcomeFragment.newInstance(), WelcomeFragment.TAG)
            .addToBackStack(null)
            .commit()

         mainViewModel = ViewModelProvider(this).get(MainActyvityViewModel::class.java)

        createDbSettings()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }

    private fun createDbSettings() {

        val dao = UniversityDatabase.getInstance(this).universityDao
        val classroomDao = UniversityDatabase.getInstance(this).classroomDao
        val teacherDao = UniversityDatabase.getInstance(this).teacherDao
        val subjectDao = UniversityDatabase.getInstance(this).subjectDao
        val sWtDao = UniversityDatabase.getInstance(this).sWtDao
        val cWsDao = UniversityDatabase.getInstance(this).cWsDao

        val classroom = listOf(
            Classroom("Mike Litoris"),
            Classroom("Jack Goff"),
            Classroom("Chris P. Chicken")
        )

        val subjects = listOf(
            Subject("Dating for programmers", "ONPU"),
            Subject("Avoiding depression", "Mechnikov"),
            Subject("Bug Fix Meditation", "ONPU"),
            Subject("Logcat for Newbies", "ONPU"),
            Subject("How to use Google", "ONPU")
        )
        val teacher = listOf(
            Teacher("Beff Jezos", "Nokia", 33),
            Teacher("Mark Suckerberg", "Iphone", 33),
            Teacher("Gill Bates", "Meizu", 33),
            Teacher("Donny Jepp", "Honor", 43),
            Teacher("Hom Tanks", "OnePlus", 44)
        )
        val teacherSubjectCrossRef = listOf(
            TeacherSubjectCrossRef("Beff Jezos", "Dating for programmers"),
            TeacherSubjectCrossRef("Beff Jezos", "Avoiding depression"),
            TeacherSubjectCrossRef("Beff Jezos", "Bug Fix Meditation"),
            TeacherSubjectCrossRef("Beff Jezos", "Logcat for Newbies"),
            TeacherSubjectCrossRef("Mark Suckerberg", "Dating for programmers"),
            TeacherSubjectCrossRef("Gill Bates", "How to use Google"),
            TeacherSubjectCrossRef("Donny Jepp", "Logcat for Newbies"),
            TeacherSubjectCrossRef("Hom Tanks", "Avoiding depression"),
            TeacherSubjectCrossRef("Hom Tanks", "Dating for programmers")
        )
        val classroomSubjectCrossRef = listOf(
            ClassroomSubjectCrossRef("Beff Jezos", "Dating for programmers"),
            ClassroomSubjectCrossRef("Beff Jezos", "Avoiding depression"),
            ClassroomSubjectCrossRef("Beff Jezos", "Bug Fix Meditation"),
            ClassroomSubjectCrossRef("Beff Jezos", "Logcat for Newbies"),
            ClassroomSubjectCrossRef("Mark Suckerberg", "Dating for programmers"),
            ClassroomSubjectCrossRef("Gill Bates", "How to use Google"),
            ClassroomSubjectCrossRef("Donny Jepp", "Logcat for Newbies"),
            ClassroomSubjectCrossRef("Hom Tanks", "Avoiding depression"),
            ClassroomSubjectCrossRef("Hom Tanks", "Dating for programmers")
        )

        lifecycleScope.launch {
            classroom.forEach { classroomDao.insertClassroom(it) }
            subjects.forEach { subjectDao.insert(it) }
            teacher.forEach { teacherDao.insertTeacher(it) }
            teacherSubjectCrossRef.forEach { sWtDao.insertTeacherSubjectCrossRef(it) }
            classroomSubjectCrossRef.forEach { cWsDao.insertClassroomSubjectCrossRef(it) }
        }
    }

}