package com.example.mytask.presentation.info_teacher_week

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentViewTeacherWeekBinding

class InfoTeacher : Fragment() {

    private lateinit var binding: FragmentViewTeacherWeekBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentViewTeacherWeekBinding.inflate(inflater,container,false)

        return binding.root
    }
}