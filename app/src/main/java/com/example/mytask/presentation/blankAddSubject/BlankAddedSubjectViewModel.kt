package com.example.mytask.presentation.blankAddSubject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.entities.Subject
import com.example.mytask.domain.usecase.AddSubjectUseCase
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class BlankAddedSubjectViewModel(
    private val addSubjectUseCase: AddSubjectUseCase
) : ViewModel() {

    private val _effects = MutableSharedFlow<Effect>()
    val effects = _effects.asSharedFlow()

    fun addSubject(subject: String) {
        val subjectData = Subject(
            subjectName = subject,
            "TEST"
        )
        viewModelScope.launch {
            addSubjectUseCase.invoke(subjectData).fold(
                onSuccess = {
                    _effects.emit(Effect.SuccessAddedNavigation)
                },
                onFailure = {
                    _effects.emit(Effect.ErrorAdded)
                }
            )
        }
    }
}

sealed class Effect {
    object SuccessAddedNavigation: Effect()
    object ErrorAdded: Effect()
}

class BlankAddedSubjectViewModelFactory @Inject constructor(
    private val addSubjectUseCase: AddSubjectUseCase
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BlankAddedSubjectViewModel(
            addSubjectUseCase
        ) as T
    }
}