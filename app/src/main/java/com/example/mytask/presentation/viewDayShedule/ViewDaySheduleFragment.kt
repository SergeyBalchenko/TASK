package com.example.mytask.presentation.viewDayShedule
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.databinding.FragmentViewDaySheduleBinding

class ViewDaySheduleFragment : Fragment() {

    private lateinit var binding: FragmentViewDaySheduleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewDaySheduleBinding.inflate(inflater,container,false)

        val viewDaySheduleViewModel = ViewModelProvider(this).get(ViewDaySheduleViewModel::class.java)

        return  binding.root
    }
}
