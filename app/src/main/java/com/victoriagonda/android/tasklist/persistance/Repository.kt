package com.victoriagonda.android.tasklist.persistance

import androidx.lifecycle.LiveData
import com.victoriagonda.android.tasklist.Tasklist

interface Repository {
  fun saveTasklist(tasklist: Tasklist)
  fun getTasklists(): LiveData<List<Tasklist>>
  fun getTasklist(id: Int): LiveData<Tasklist>
  fun saveTasklistItem(tasklist: Tasklist, name: String)
}