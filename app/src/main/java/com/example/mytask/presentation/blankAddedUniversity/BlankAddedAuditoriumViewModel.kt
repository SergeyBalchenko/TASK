package com.example.mytask.presentation.blankAddedUniversity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.entities.Classroom
import com.example.mytask.domain.usecase.AddClassroomUseCase
import com.example.mytask.presentation.blankAddSubject.Effect
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class BlankAddedAuditoriumViewModel(
    private val addUniversityUseCase: AddClassroomUseCase
) : ViewModel() {

    private val _effects = MutableSharedFlow<Effect>()
    val effects = _effects.asSharedFlow()
    fun addUniversity(locationName: String) {
        val classroomData = Classroom(
            classroomName = locationName
            )
        viewModelScope.launch {
            addUniversityUseCase.invoke(classroomData).fold(
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
    private val addClassroomUseCase: AddClassroomUseCase
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BlankAddedAuditoriumViewModel(
            addClassroomUseCase
        ) as T
    }
}