package com.example.mytask.presentation.day_screen
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.databinding.DayScreenFragmentBinding
import com.example.mytask.databinding.MainScreenBinding
import com.example.mytask.presentation.main.MainFragment


class DayScreenFragment : Fragment() {
    private lateinit var binding: DayScreenFragmentBinding

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
        binding = DayScreenFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}