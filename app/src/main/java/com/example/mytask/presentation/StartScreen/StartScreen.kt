package com.example.mytask.presentation.StartScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.MainScreenBinding
import com.example.mytask.databinding.StartScreenBinding
import com.example.mytask.presentation.day_screen.DayScreenFragment
import com.example.mytask.presentation.friday.FragmentFriday
import com.example.mytask.presentation.main.MainFragment
import com.example.mytask.presentation.thursday.FragmentThursday
import com.example.mytask.presentation.tuesday.FragmentTuesday
import com.example.mytask.presentation.wednesday.FragmentWednesday

class StartScreen: Fragment() {
    private lateinit var binding: StartScreenBinding

    companion object {
        val TAG = StartScreen::class.simpleName

        fun newInstance(): StartScreen {
            return StartScreen()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = StartScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonShowMoreMonday.setOnClickListener {
            openDayScreenFragment()
        }
        binding.buttonShowMoreWednesday.setOnClickListener {
            openFragmentWednesday()
        }
        binding.buttonShowMoreThursday.setOnClickListener {
            openFragmentThursday()
        }
        binding.buttonShowMoreTuesday.setOnClickListener {
            openFragmentTuesday()
        }
        binding.buttonShowMoreFriday.setOnClickListener {
            openFragmentFriday()
        }
    }

    private fun openDayScreenFragment() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, DayScreenFragment.newInstance(), DayScreenFragment.TAG)
            .addToBackStack(MainFragment.TAG)
            .commit()
    }
    private fun openFragmentWednesday() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, FragmentWednesday.newInstance(), FragmentWednesday.TAG)
            .addToBackStack(FragmentWednesday.TAG)
            .commit()
    }
    private fun openFragmentThursday() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, FragmentThursday.newInstance(), FragmentThursday.TAG)
            .addToBackStack(FragmentThursday.TAG)
            .commit()
    }
    private fun openFragmentTuesday() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, FragmentTuesday.newInstance(), FragmentTuesday.TAG)
            .addToBackStack(FragmentTuesday.TAG)
            .commit()
    }
    private fun openFragmentFriday() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, FragmentFriday.newInstance(), FragmentFriday.TAG)
            .addToBackStack(FragmentFriday.TAG)
            .commit()
    }
}