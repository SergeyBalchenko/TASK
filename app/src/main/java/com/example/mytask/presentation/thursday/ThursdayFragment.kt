package com.example.mytask.presentation.thursday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentThursdayBinding
import com.example.mytask.presentation.StartScreen.StartScreenFragment
import com.example.mytask.presentation.blankForAddSubject.BlankAddSubjectFragment

class ThursdayFragment : Fragment() {
    private lateinit var binding: FragmentThursdayBinding

    companion object {
        val TAG = ThursdayFragment::class.simpleName

        fun newInstance(): ThursdayFragment {
            return ThursdayFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThursdayBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnUpDayWeek.setOnClickListener {
            popBack()
        }
        binding.buttonPlusSubject.setOnClickListener {
            openBlankAddSubject()
        }
    }
    private fun popBack(){
        parentFragmentManager.popBackStack()
    }
    private fun openBlankAddSubject(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddSubjectFragment.newInstance(), BlankAddSubjectFragment.TAG)
            .addToBackStack(BlankAddSubjectFragment.TAG)
            .commit()
    }

}