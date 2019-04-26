package com.victoriagonda.android.tasklist.persistance;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J!\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/victoriagonda/android/tasklist/persistance/TasklistDao;", "", "findById", "Landroidx/lifecycle/LiveData;", "Lcom/victoriagonda/android/tasklist/Tasklist;", "id", "", "getAll", "", "save", "", "tasklist", "", "([Lcom/victoriagonda/android/tasklist/Tasklist;)V", "app_debug"})
public abstract interface TasklistDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasklist")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.victoriagonda.android.tasklist.Tasklist>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasklist WHERE id = :id")
    public abstract androidx.lifecycle.LiveData<com.victoriagonda.android.tasklist.Tasklist> findById(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void save(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.Tasklist... tasklist);
}