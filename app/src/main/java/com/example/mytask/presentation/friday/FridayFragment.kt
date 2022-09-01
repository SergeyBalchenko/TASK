package com.example.mytask.presentation.friday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.R
import com.example.mytask.databinding.FragmentFridayBinding
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
        binding = FragmentFridayBinding.inflate(inflater, container, false)

        val fridayViewModel = ViewModelProvider(this).get(FridayViewModel::class.java)

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
    private fun popBack() {
        parentFragmentManager.popBackStack()
    }
    private fun openBlankAddSubject(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, BlankAddSubjectFragment.newInstance(), BlankAddSubjectFragment.TAG)
            .addToBackStack(BlankAddSubjectFragment.TAG)
            .commit()
    }
}