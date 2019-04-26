package com.victoriagonda.android.tasklist.persistance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/victoriagonda/android/tasklist/persistance/RepositoryImpl;", "Lcom/victoriagonda/android/tasklist/persistance/Repository;", "tasklistDao", "Lcom/victoriagonda/android/tasklist/persistance/TasklistDao;", "(Lcom/victoriagonda/android/tasklist/persistance/TasklistDao;)V", "getTasklistDao", "()Lcom/victoriagonda/android/tasklist/persistance/TasklistDao;", "getTasklist", "Landroidx/lifecycle/LiveData;", "Lcom/victoriagonda/android/tasklist/Tasklist;", "id", "", "getTasklists", "", "saveTasklist", "", "tasklist", "saveTasklistItem", "name", "", "app_debug"})
public final class RepositoryImpl implements com.victoriagonda.android.tasklist.persistance.Repository {
    @org.jetbrains.annotations.NotNull()
    private final com.victoriagonda.android.tasklist.persistance.TasklistDao tasklistDao = null;
    
    @java.lang.Override()
    public void saveTasklist(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.Tasklist tasklist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.victoriagonda.android.tasklist.Tasklist>> getTasklists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.victoriagonda.android.tasklist.Tasklist> getTasklist(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void saveTasklistItem(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.Tasklist tasklist, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.victoriagonda.android.tasklist.persistance.TasklistDao getTasklistDao() {
        return null;
    }
    
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.persistance.TasklistDao tasklistDao) {
        super();
    }
}