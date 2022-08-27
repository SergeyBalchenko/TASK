package com.example.mytask.presentation.friday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentFridayBinding
import com.example.mytask.databinding.FragmentThursdayBinding
import com.example.mytask.presentation.StartScreen.StartScreen
import com.example.mytask.presentation.blank_for_add_subject.BlankAddSubject

class FragmentFriday : Fragment() {
    private lateinit var binding: FragmentFridayBinding

    companion object {
        val TAG = FragmentFriday::class.simpleName

        fun newInstance(): FragmentFriday {
            return FragmentFriday()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFridayBinding.inflate(inflater, container, false)
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