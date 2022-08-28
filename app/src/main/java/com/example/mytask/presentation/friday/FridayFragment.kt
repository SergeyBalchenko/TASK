package com.example.mytask.presentation.friday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentFridayBinding
import com.example.mytask.presentation.StartScreen.StartScreenFragment
import com.example.mytask.presentation.blankForAddSubject.BlankAddSubjectFragment

class FridayFragment : Fragment() {
    private lateinit var binding: FragmentFridayBinding

    companion object {
        val TAG = FridayFragment::class.simpleName

        fun newInstance(): FridayFragment {
            return FridayFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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
            .replace(R.id.container, StartScreenFragment.newInstance(), StartScreenFragment.TAG)
            .addToBackStack(StartScreenFragment.TAG)
            .commit()
    }
    private fun openBlankAddSubject(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddSubjectFragment.newInstance(), BlankAddSubjectFragment.TAG)
            .addToBackStack(BlankAddSubjectFragment.TAG)
            .commit()
    }
}