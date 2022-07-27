package com.example.mytask.presentation.day_screen
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.DayScreenFragmentBinding
import com.example.mytask.databinding.MainScreenBinding
import com.example.mytask.presentation.StartScreen.StartScreen
import com.example.mytask.presentation.blank_for_add_subject.BlankAddSubject
import com.example.mytask.presentation.main.MainFragment


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
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnUpForSubject.setOnClickListener {
            openStartScreen()
        }
        binding.buttonPlusSubject.setOnClickListener {
            openBlankAddSubject()
        }
    }
    private fun openStartScreen(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container,StartScreen.newInstance(), StartScreen.TAG)
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