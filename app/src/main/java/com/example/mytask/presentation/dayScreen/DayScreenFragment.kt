package com.example.mytask.presentation.dayScreen
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.R
import com.example.mytask.databinding.DayScreenFragmentBinding
import com.example.mytask.presentation.blankForAddSubject.BlankAddSubjectFragment


class DayScreenFragment : Fragment() {
    private lateinit var binding: DayScreenFragmentBinding

    companion object {
        val TAG = DayScreenFragment::class.simpleName

        fun newInstance(): DayScreenFragment {
            return DayScreenFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DayScreenFragmentBinding.inflate(inflater, container, false)

        val dayScreenViewModel = ViewModelProvider(this).get(DayScreenViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnUpForSubject.setOnClickListener {
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