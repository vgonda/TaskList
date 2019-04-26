package com.victoriagonda.android.tasklist.persistance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/victoriagonda/android/tasklist/persistance/Repository;", "", "getTasklist", "Landroidx/lifecycle/LiveData;", "Lcom/victoriagonda/android/tasklist/Tasklist;", "id", "", "getTasklists", "", "saveTasklist", "", "tasklist", "saveTasklistItem", "name", "", "app_debug"})
public abstract interface Repository {
    
    public abstract void saveTasklist(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.Tasklist tasklist);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.victoriagonda.android.tasklist.Tasklist>> getTasklists();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.victoriagonda.android.tasklist.Tasklist> getTasklist(int id);
    
    public abstract void saveTasklistItem(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.Tasklist tasklist, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
}