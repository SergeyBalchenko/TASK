package com.example.mytask.presentation.wednesday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.DayScreenFragmentBinding
import com.example.mytask.databinding.FragmentWednesdayBinding
import com.example.mytask.presentation.StartScreen.StartScreen
import com.example.mytask.presentation.blank_for_add_subject.BlankAddSubject
import com.example.mytask.presentation.day_screen.DayScreenFragment

class FragmentWednesday : Fragment() {
    private lateinit var binding: FragmentWednesdayBinding

    companion object {
        val TAG = FragmentWednesday::class.simpleName

        fun newInstance(): FragmentWednesday {
            return FragmentWednesday()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWednesdayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnUpDayWeek.setOnClickListener {
            openStartScreen()
        }
        binding.buttonPlusSubject.setOnClickListener {
            openBlankAddSubject()
        }
    }
    private fun openStartScreen(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, StartScreen.newInstance(), StartScreen.TAG)
            .addToBackStack(StartScreen.TAG)
            .commit()
    }
    private fun openBlankAddSubject(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddSubject.newInstance(), BlankAddSubject.TAG)
            .addToBackStack(BlankAddSubject.TAG)
            .commit()
    }
}