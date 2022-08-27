package com.example.mytask.presentation.viewDayShedule
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.MainScreenBinding
import com.example.mytask.presentation.main.MainFragment

class ViewContainerDaySheduleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_conteiner_day_shedule, container, false)
    }
}
