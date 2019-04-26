package com.victoriagonda.android.tasklist.persistance;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.victoriagonda.android.tasklist.persistance.StringListConverter.class})
@androidx.room.Database(entities = {com.victoriagonda.android.tasklist.Tasklist.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/victoriagonda/android/tasklist/persistance/TasklistDatabase;", "Landroidx/room/RoomDatabase;", "()V", "tasklistDao", "Lcom/victoriagonda/android/tasklist/persistance/TasklistDao;", "app_debug"})
public abstract class TasklistDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.victoriagonda.android.tasklist.persistance.TasklistDao tasklistDao();
    
    public TasklistDatabase() {
        super();
    }
}