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
import com.example.mytask.databinding.FragmentScrollForAuditiriumBinding
import com.example.mytask.presentation.scrollForAuditoria.AuditoriumListAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class ScrollForAuditoriumFragment : Fragment() {

    private lateinit var binding: FragmentScrollForAuditiriumBinding

    private lateinit var viewModel: ScrollForAuditoriumViewModel

    private lateinit var adapter: AuditoriumListAdapter

    companion object {
        val TAG = ScrollForAuditoriumFragment::class.simpleName

        fun newInstance(): ScrollForAuditoriumFragment {
            return ScrollForAuditoriumFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScrollForAuditiriumBinding.inflate(inflater, container, false)

        val scrollForAuditoriumViewModel = ViewModelProvider(this).get(ScrollForAuditoriumViewModel::class.java)

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

    private fun handleUiState(viewState: ViewStateAudit) {
        if (viewState.loading) {
            // TODO: create progressBar
        }
        if (viewState.error) {
            // TODO: create error, hide progress, hide list with data
        }

        if (viewState.loading.not() && viewState.error.not()) {
            binding.teacherRecyclerView.visibility = View.VISIBLE
            adapter.submitList(viewState.classroomName)
        }
    }

    private fun popBack() {
        parentFragmentManager.popBackStack()
    }
}