package com.example.mytask.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.MainScreenBinding
import com.example.mytask.presentation.MainScrolChooseUniversity.MainScrolChooseUniversity.MainChooseUniersity
import com.example.mytask.presentation.StartScreen.StartScreen
import com.example.mytask.presentation.blank_adde_university.BlankAddedUniversity
import com.example.mytask.presentation.blank_added_teacher.BlankAddedTeacher
import com.example.mytask.presentation.blank_for_add_subject.BlankAddSubject
import com.example.mytask.presentation.main.MainFragment.Companion.TAG
import com.example.mytask.presentation.scrollForSubject.ScrollForSubject
import com.example.mytask.presentation.scroll_for_teacher.ScrollForTeacher

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
            .replace(R.id.container, StartScreen.newInstance(), StartScreen.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openMainChooseUniversity(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, MainChooseUniersity.newInstance(), MainChooseUniersity.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openBlankAddedUniversity(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddedUniversity.newInstance(), BlankAddedUniversity.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openScrollForTeacher() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, ScrollForTeacher.newInstance(), ScrollForTeacher.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openBlankAddedTeacher() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddedTeacher.newInstance(), BlankAddedTeacher.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openBlankAddSubject() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddSubject.newInstance(), BlankAddSubject.TAG)
            .addToBackStack(TAG)
            .commit()
    }
    private fun openScrollForSubject() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, ScrollForSubject.newInstance(), ScrollForSubject.TAG)
            .addToBackStack(TAG)
            .commit()
    }

}