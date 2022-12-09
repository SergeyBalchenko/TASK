package com.example.mytask.presentation.blankAddedTeacher

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.mytask.App
import com.example.mytask.databinding.FragmentBlankAddedTeacherBinding
import com.example.mytask.presentation.blankAddSubject.Effect
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

class BlankAddedTeacherFragment : Fragment() {

    private lateinit var binding: FragmentBlankAddedTeacherBinding
    private lateinit var viewModel: BlankAddedTeacherViewModel


    @Inject
    lateinit var viewModelFactory: BlankAddedTeacherViewModelFactory

    companion object {
        val TAG = BlankAddedTeacherFragment::class.simpleName

        fun newInstance() = BlankAddedTeacherFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankAddedTeacherBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as App).appComponent.inject(this)
        viewModel = ViewModelProvider(this, viewModelFactory)[BlankAddedTeacherViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.effects.onEach(::handleUiEvent).launchIn(this)
            }
        }
    }

    private fun handleUiEvent(event: Effect) {
        when (event) {
            is Effect.SuccessAddedNavigation -> {
                parentFragmentManager.popBackStack()
            }

            is Effect.ErrorAdded -> {
                Toast.makeText(requireActivity(), "Can't add a Teacher", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun setupClickListeners() {
        binding.buttonAdd.setOnClickListener {
            val teacherPhone = binding.editTextPhoneNumber.text.toString()
            val teacherAge = binding.editTextAge.text.toString().toInt()
            val teacherName = binding.editTextTeacherName.text.toString()

            viewModel.addTeacher(teacherPhone, teacherAge, teacherName)
        }
    }
}