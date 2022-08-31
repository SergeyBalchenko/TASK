package com.example.mytask.presentation.info_teacher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.databinding.FragmentInfoTeacherBinding

class InfoTeacherFragment : Fragment() {
    private lateinit var binding: FragmentInfoTeacherBinding

    private val infoTeacherViewModel = ViewModelProvider(this).get(InfoTeacherViewModel::class.java)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoTeacherBinding.inflate(inflater,container,false)
        return binding.root
    }
}