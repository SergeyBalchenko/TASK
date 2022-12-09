package com.example.mytask.presentation.blankAddedUniversity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.University
import com.example.mytask.domain.usecase.AddSubjectUseCase
import com.example.mytask.domain.usecase.AddUniversityUseCase
import com.example.mytask.presentation.blankAddSubject.BlankAddedSubjectViewModel
import com.example.mytask.presentation.blankAddSubject.Effect
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class BlankAddedUniversityViewModel(
    private val addUniversityUseCase: AddUniversityUseCase
) : ViewModel() {

    private val _effects = MutableSharedFlow<Effect>()
    val effects = _effects.asSharedFlow()
    fun addUniversity(university: String) {
        val universityData = University(
            universityName = university,
        )
        viewModelScope.launch {
            addUniversityUseCase.invoke(universityData).fold(
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

class BlankAddedUniversityViewModelFactory @Inject constructor(
    private val addUniversityUseCase: AddUniversityUseCase
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BlankAddedUniversityViewModel(
            addUniversityUseCase
        ) as T
    }
}