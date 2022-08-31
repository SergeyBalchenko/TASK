package com.example.mytask.presentation.teacherWeek

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.databinding.FragmentTeacherInWeekBinding

class TeacherInWeekFragment : Fragment() {

    private lateinit var binding: FragmentTeacherInWeekBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTeacherInWeekBinding.inflate(inflater,container,false)

        val teacherInWeekViewModel = ViewModelProvider(this).get(TeacherInWeekViewModel::class.java)

        return binding.root
    }
}