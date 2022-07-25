package com.example.mytask.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.MainScreenBinding
import com.example.mytask.presentation.StartScreen.StartScreen

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
    }

    private fun openStartScreen() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, StartScreen.newInstance(), StartScreen.TAG)
            .addToBackStack(TAG)
            .commit()
    }
}