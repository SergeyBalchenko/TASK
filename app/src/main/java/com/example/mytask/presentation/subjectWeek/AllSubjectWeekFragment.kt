package com.example.mytask.presentation.subjectWeek

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.databinding.AllSubjectWeekBinding

class BlankFragment : Fragment() {
    private lateinit var binding: AllSubjectWeekBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = AllSubjectWeekBinding.inflate(inflater, container, false)
        return binding.root
    }
}