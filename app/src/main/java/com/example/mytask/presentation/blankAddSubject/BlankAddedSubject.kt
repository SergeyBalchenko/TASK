package com.example.mytask.presentation.blankAddSubject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.databinding.FragmentInfoTeacherBinding
import com.example.mytask.presentation.blankForAddSubject.BlankAddedSubjectViewModel

class BlankAddedSubject : Fragment() {

    private lateinit var binding: FragmentInfoTeacherBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoTeacherBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        val blankAddedSubject = ViewModelProvider(this).get(BlankAddedSubjectViewModel::class.java)

        return binding.root
    }
}