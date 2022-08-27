package com.example.mytask.presentation.scroll_for_teacher

import android.nfc.Tag
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentScrollForTeacherBinding
import com.google.android.material.tabs.TabLayout

class ScrollForTeacher : Fragment() {

    private  lateinit var binding: FragmentScrollForTeacherBinding

    companion object {
        val TAG = ScrollForTeacher::class.simpleName

        fun newInstance(): ScrollForTeacher {
            return ScrollForTeacher ()
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scroll_for_teacher, container, false)
    }
}