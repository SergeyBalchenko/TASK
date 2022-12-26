package com.example.mytask.presentation.scrollForTeacher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.mytask.databinding.FragmentScrollForTeacherBinding
import kotlinx.coroutines.flow.forEach
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class ScrollForTeacherFragment : Fragment() {

    private lateinit var binding: FragmentScrollForTeacherBinding

    // TODO: подключишь viewModel
    private lateinit var viewModel: ScrollForTeacherViewModel

    private lateinit var adapter: TeacherListAdapter

    companion object {
        val TAG = ScrollForTeacherFragment::class.simpleName

        fun newInstance(): ScrollForTeacherFragment {
            return ScrollForTeacherFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScrollForTeacherBinding.inflate(inflater, container, false)

        val scrollForTeacherViewModel =
            ViewModelProvider(this).get(ScrollForTeacherViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBack.setOnClickListener {
            popBack()
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.viewState.onEach(::handleUiState).launchIn(this)
            }
        }
    }

    private fun handleUiState(viewState: ViewState) {
        if (viewState.loading) {
            // TODO: create progressBar
        }
        if (viewState.error) {
            // TODO: create error, hide progress, hide list with data
        }

        if (viewState.loading.not() && viewState.error.not()) {
            binding.teacherRecyclerView.visibility = View.VISIBLE
            adapter.submitList(viewState.teachers)
        }
    }

    private fun popBack() {
        parentFragmentManager.popBackStack()
    }
}