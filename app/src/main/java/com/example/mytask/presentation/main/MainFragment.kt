package com.example.mytask.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.databinding.MainScreenBinding

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
}