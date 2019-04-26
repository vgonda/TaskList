package com.victoriagonda.android.tasklist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.victoriagonda.android.tasklist.persistance.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {

  fun saveNewList(name: String) {
      repository.saveTasklist(Tasklist(name, listOf()))
  }

  fun getTasklists(): LiveData<List<Tasklist>> {
    return repository.getTasklists()
  }
}