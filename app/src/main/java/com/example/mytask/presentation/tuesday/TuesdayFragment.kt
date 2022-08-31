package com.example.mytask.presentation.tuesday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.R
import com.example.mytask.databinding.FragmentTuesdayBinding
import com.example.mytask.presentation.StartScreen.StartScreenFragment
import com.example.mytask.presentation.blankForAddSubject.BlankAddSubjectFragment

class TuesdayFragment : Fragment() {

    private  lateinit var binding: FragmentTuesdayBinding

    companion object {
        val TAG = TuesdayFragment::class.simpleName

        fun  newInstance(): TuesdayFragment {
            return TuesdayFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTuesdayBinding.inflate(inflater, container, false)

        val tuesdayViewModel = ViewModelProvider(this).get(TuesdayViewModel::class.java)

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