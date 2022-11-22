package com.example.mytask.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.R
import com.example.mytask.databinding.MainScreenBinding
import com.example.mytask.presentation.mainChooseUniversity.MainScrolChooseUniversity.MainChooseUniversityFragment
import com.example.mytask.presentation.startScreen.StartScreenFragment
import com.example.mytask.presentation.blankAddeUniversity.BlankAddedUniversityFragment
import com.example.mytask.presentation.blankAddedTeacher.BlankAddedTeacherFragment
import com.example.mytask.presentation.blankForAddSubject.BlankAddSubjectFragment
import com.example.mytask.presentation.scrollForSubject.ScrollForSubjectFragment
import com.example.mytask.presentation.scrollForTeacher.ScrollForTeacherFragment

class MainFragment: Fragment() {

    private lateinit var binding: MainScreenBinding

    companion object {
        val TAG = MainFragment::class.simpleName

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainScreenBinding.inflate(inflater, container, false)

        val mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonWeekSchedule.setOnClickListener{
            openStartScreen()
        }
        binding.buttonShowMoreUniversity.setOnClickListener{
            openMainChooseUniversity()
        }
        binding.buttonPlusUniversity.setOnClickListener{
            openBlankAddedUniversity()
        }
        binding.buttonShowMoreTeacher.setOnClickListener{
            openScrollForTeacher()
        }
        binding.buttonAddTeacher.setOnClickListener{
            openBlankAddedTeacher()
        }
        binding.buttonPlusSubject.setOnClickListener{
            openBlankAddSubject()
        }
        binding.buttonShowMoreSubject.setOnClickListener{
            openScrollForSubject()
        }
    }

    private fun openStartScreen() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, StartScreenFragment.newInstance(), StartScreenFragment.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openMainChooseUniversity(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, MainChooseUniversityFragment.newInstance(), MainChooseUniversityFragment.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openBlankAddedUniversity(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddedUniversityFragment.newInstance(), BlankAddedUniversityFragment.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openScrollForTeacher() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, ScrollForTeacherFragment.newInstance(), ScrollForTeacherFragment.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openBlankAddedTeacher() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddedTeacherFragment.newInstance(), BlankAddedTeacherFragment.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openBlankAddSubject() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddSubjectFragment.newInstance(), BlankAddSubjectFragment.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openScrollForSubject() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, ScrollForSubjectFragment.newInstance(), ScrollForSubjectFragment.TAG)
            .addToBackStack(TAG)
            .commit()
    }
}