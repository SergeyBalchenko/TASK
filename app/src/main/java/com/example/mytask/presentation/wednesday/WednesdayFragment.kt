package com.example.mytask.presentation.wednesday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentWednesdayBinding
import com.example.mytask.presentation.StartScreen.StartScreenFragment
import com.example.mytask.presentation.blankForAddSubject.BlankAddSubjectFragment

class WednesdayFragment : Fragment() {
    private lateinit var binding: FragmentWednesdayBinding

    companion object {
        val TAG = WednesdayFragment::class.simpleName

        fun newInstance(): WednesdayFragment {
            return WednesdayFragment()
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