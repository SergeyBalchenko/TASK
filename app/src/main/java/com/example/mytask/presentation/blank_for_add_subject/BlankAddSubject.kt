package com.example.mytask.presentation.blank_for_add_subject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentBlankAddSubjectBinding

class BlankAddSubject : Fragment() {

    private lateinit var binding: FragmentBlankAddSubjectBinding

    companion object {
        val TAG = BlankAddSubject::class.simpleName

        fun newInstance(): BlankAddSubject {
            return BlankAddSubject()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_add_subject, container, false)
    }
}