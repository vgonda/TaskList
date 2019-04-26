package com.victoriagonda.android.tasklist.persistance

import androidx.lifecycle.LiveData
import com.victoriagonda.android.tasklist.Tasklist

class RepositoryImpl(val tasklistDao: TasklistDao) : Repository {

  override fun saveTasklist(tasklist: Tasklist) {
    tasklistDao.save(tasklist)
  }

  override fun getTasklists(): LiveData<List<Tasklist>> {
    return tasklistDao.getAll()
  }

  override fun getTasklist(id: Int): LiveData<Tasklist> {
    return tasklistDao.findById(id)
  }

  override fun saveTasklistItem(tasklist: Tasklist, name: String) {
    tasklistDao.save(tasklist.copy(items = tasklist.items + name))
  }
}