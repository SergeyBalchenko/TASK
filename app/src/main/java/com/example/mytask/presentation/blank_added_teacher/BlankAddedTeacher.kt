package com.example.mytask.presentation.blank_added_teacher

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.FragmentBlankAddedTeacherBinding
import com.example.mytask.presentation.main.MainFragment

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
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBlankAddedTeacherBinding.inflate(inflater, container, false)
        return binding.root}
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBack.setOnClickListener {
            openMainScreen()
        }
    }
    private fun openMainScreen(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment.newInstance(), MainFragment.TAG)
            .addToBackStack(MainFragment.TAG)
            .commit()
    }
    }