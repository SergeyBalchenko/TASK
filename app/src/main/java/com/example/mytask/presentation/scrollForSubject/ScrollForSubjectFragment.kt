package com.example.mytask.presentation.scrollForSubject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.mytask.databinding.FragmentScrollForSubjectBinding
import com.example.mytask.presentation.scrollForTeacher.ViewState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class ScrollForSubjectFragment : Fragment() {

    private lateinit var binding: FragmentScrollForSubjectBinding

    private lateinit var viewModel: ScrollForSubjectViewModel

    private lateinit var adapter: ScrollForSubjectAdapter

    companion object {
        val TAG = ScrollForSubjectFragment::class.simpleName

        fun newInstance(): ScrollForSubjectFragment {
            return ScrollForSubjectFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScrollForSubjectBinding.inflate(inflater, container, false)

        val scrollForSubjectViewModel =
            ViewModelProvider(this).get(ScrollForSubjectViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBack.setOnClickListener {
            popBack()
        }
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.viewState.onEach(::handleUiStateSub).launchIn(this)
            }
        }
    }

    private fun handleUiStateSub(viewState: ViewStateSubject) {
        if (viewState.loading) {
            // TODO: create progressBar
        }
        if (viewState.error) {
            // TODO: create error, hide progress, hide list with data
        }

        if (viewState.loading.not() && viewState.error.not()) {
            binding.recyclerViewSubject.visibility = View.VISIBLE
            adapter.submitList(viewState.subjects)
        }
    }

    private fun popBack() {
        parentFragmentManager.popBackStack()
    }
}