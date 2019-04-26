package com.victoriagonda.android.tasklist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.victoriagonda.android.tasklist.persistance.Repository

class DetailViewModel(private val repository: Repository) : ViewModel() {

  fun saveNewItem(tasklist: Tasklist, name: String) {
    repository.saveTasklistItem(tasklist, name)
  }

  fun getTasklist(id: Int): LiveData<Tasklist> {
    return repository.getTasklist(id)
  }
}