package com.example.mytask.presentation.wednesday
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
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
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWednesdayBinding.inflate(inflater, container, false)

        val wednesdayViewModel = ViewModelProvider(this).get(WednesdayViewModel::class.java)

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