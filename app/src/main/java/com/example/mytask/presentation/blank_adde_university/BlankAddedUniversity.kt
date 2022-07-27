package com.example.mytask.presentation.blank_adde_university

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentBlankAddedUniversityBinding

class BlankAddedUniversity : Fragment() {

    private lateinit var binding: FragmentBlankAddedUniversityBinding

    companion object {
        val TAG = BlankAddedUniversity::class.simpleName

        fun newInstance(): BlankAddedUniversity{
            return BlankAddedUniversity()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_added_university, container, false)
    }
}