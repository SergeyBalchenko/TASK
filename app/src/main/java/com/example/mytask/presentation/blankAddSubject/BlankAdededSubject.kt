package com.example.mytask.presentation.blankAddSubject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.databinding.FragmentInfoTeacherBinding

class BlankAdededSubject : Fragment() {
    private lateinit var binding: FragmentInfoTeacherBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoTeacherBinding.inflate(inflater,container,false)
        return binding.root
    }
}