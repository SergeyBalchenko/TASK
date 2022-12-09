package com.example.mytask.presentation.blankAddedTeacher

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.entities.Teacher
import com.example.mytask.domain.usecase.AddTeacherUseCase
import com.example.mytask.presentation.blankAddSubject.Effect
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class BlankAddedTeacherViewModel(
    private val addTeacherUseCase: AddTeacherUseCase
) : ViewModel (){

    private val _effects = MutableSharedFlow<Effect>()
    val effects = _effects.asSharedFlow()


    fun addTeacher(teacherPhone: String, teacherAge: Int, teacherName: String) {
        val teacherData = Teacher(
            teacherPhone = teacherPhone,
            teacherAge = teacherAge,
            teacherName = teacherName
        )
        viewModelScope.launch {
            addTeacherUseCase.invoke(teacherData).fold(
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


class BlankAddedTeacherViewModelFactory @Inject constructor(
    private val addTeacherUseCase: AddTeacherUseCase
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BlankAddedTeacherViewModel(
            addTeacherUseCase
        ) as T
    }
}