package com.example.mytask.presentation.StartScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.StartScreenBinding
import com.example.mytask.presentation.dayScreen.DayScreenFragment
import com.example.mytask.presentation.friday.FridayFragment
import com.example.mytask.presentation.main.MainFragment
import com.example.mytask.presentation.thursday.ThursdayFragment
import com.example.mytask.presentation.tuesday.TuesdayFragment
import com.example.mytask.presentation.wednesday.WednesdayFragment

class StartScreenFragment: Fragment() {
    private lateinit var binding: StartScreenBinding

    companion object {
        val TAG = StartScreenFragment::class.simpleName

        fun newInstance(): StartScreenFragment {
            return StartScreenFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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
        binding.buttonBack.setOnClickListener{
            popBack()
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
            .replace(R.id.container, WednesdayFragment.newInstance(), WednesdayFragment.TAG)
            .addToBackStack(WednesdayFragment.TAG)
            .commit()
    }
    private fun openFragmentThursday() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, ThursdayFragment.newInstance(), ThursdayFragment.TAG)
            .addToBackStack(ThursdayFragment.TAG)
            .commit()
    }
    private fun openFragmentTuesday() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, TuesdayFragment.newInstance(), TuesdayFragment.TAG)
            .addToBackStack(TuesdayFragment.TAG)
            .commit()
    }
    private fun openFragmentFriday() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, FridayFragment.newInstance(), FridayFragment.TAG)
            .addToBackStack(FridayFragment.TAG)
            .commit()
    }
    private fun popBack() {
        parentFragmentManager.popBackStack()

    }
}