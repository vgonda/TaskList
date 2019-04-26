package com.victoriagonda.android.tasklist.persistance

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.victoriagonda.android.tasklist.Tasklist

@Dao
interface TasklistDao {
  @Query("SELECT * FROM tasklist")
  fun getAll(): LiveData<List<Tasklist>>

  @Query("SELECT * FROM tasklist WHERE id = :id")
  fun findById(id: Int): LiveData<Tasklist>

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun save(vararg tasklist: Tasklist)
}