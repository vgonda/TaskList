package com.victoriagonda.android.tasklist.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.victoriagonda.android.tasklist.Tasklist

@Database(entities = [Tasklist::class], version = 1)
@TypeConverters(StringListConverter::class)
abstract class TasklistDatabase : RoomDatabase() {
  abstract fun tasklistDao(): TasklistDao
}