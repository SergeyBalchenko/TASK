package com.example.mytask.data.app

import com.example.mytask.data.di.AppModule
import com.example.mytask.presentation.MainActivity
import com.example.mytask.presentation.blankAddSubject.BlankAddedSubjectFragment
import com.example.mytask.presentation.welcome.MainModule
import dagger.Component


@Component(modules = [MainModule::class, AppModule::class])
interface AppComponent {

    fun injectMainActivity(activity: MainActivity)

    fun inject(fragment: BlankAddedSubjectFragment)
}