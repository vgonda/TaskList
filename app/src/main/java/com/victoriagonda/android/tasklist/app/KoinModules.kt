package com.victoriagonda.android.tasklist.app

import androidx.room.Room
import com.victoriagonda.android.tasklist.DetailViewModel
import com.victoriagonda.android.tasklist.MainViewModel
import com.victoriagonda.android.tasklist.persistance.Repository
import com.victoriagonda.android.tasklist.persistance.RepositoryImpl
import com.victoriagonda.android.tasklist.persistance.TasklistDatabase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

  single<Repository> { RepositoryImpl(get()) }

  single {
    Room.databaseBuilder(
        get(),
        TasklistDatabase::class.java, "tasklist-database"
    )
        .allowMainThreadQueries()
        .build().tasklistDao()
  }

  viewModel { MainViewModel(get()) }

  viewModel { DetailViewModel(get()) }
}