package com.example.mytask.di

import android.content.Context
import com.example.mytask.di.module.RepositoryModule
import com.example.mytask.di.module.RetrofitModule
import com.example.mytask.di.module.RoomModule
import com.example.mytask.di.module.UseCaseModule
import com.example.mytask.presentation.MainActivity
import com.example.mytask.presentation.blankAddSubject.BlankAddedSubjectFragment
import com.example.mytask.presentation.blankAddedTeacher.BlankAddedTeacherFragment
import com.example.mytask.presentation.blankAddedUniversity.BlankAddedUniversityFragment
import com.example.mytask.presentation.main.MainFragment
import com.example.mytask.presentation.scrollForSubject.ScrollForSubjectFragment
import com.example.mytask.presentation.scrollForTeacher.ScrollForAuditoriumFragment
import com.example.mytask.presentation.scrollForTeacher.ScrollForTeacherFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Component(
    modules = [
        RoomModule::class,
        RetrofitModule::class,
        UseCaseModule::class,
        RepositoryModule::class
    ]
)
@Singleton
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    fun injectMainActivity(activity: MainActivity)

    fun inject(fragment: BlankAddedSubjectFragment)
    fun inject(fragment: MainFragment)
    fun inject(fragment: BlankAddedUniversityFragment)
    fun inject(fragment: BlankAddedTeacherFragment)
    fun inject(fragment: ScrollForTeacherFragment)
    fun inject(fragment: ScrollForSubjectFragment)
    fun inject(fragment: ScrollForAuditoriumFragment)
}