package com.example.mytask.presentation.blank_added_teacher

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.FragmentBlankAddedTeacherBinding

class BlankAddedTeacher : Fragment() {

    private lateinit var binding: FragmentBlankAddedTeacherBinding

    companion object {
        val TAG = BlankAddedTeacher::class.simpleName

        fun newInstance(): BlankAddedTeacher {
            return BlankAddedTeacher()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_added_teacher, container, false)
    }
    }