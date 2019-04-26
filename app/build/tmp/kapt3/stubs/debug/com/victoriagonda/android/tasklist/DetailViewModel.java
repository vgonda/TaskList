package com.victoriagonda.android.tasklist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/victoriagonda/android/tasklist/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/victoriagonda/android/tasklist/persistance/Repository;", "(Lcom/victoriagonda/android/tasklist/persistance/Repository;)V", "getTasklist", "Landroidx/lifecycle/LiveData;", "Lcom/victoriagonda/android/tasklist/Tasklist;", "id", "", "saveNewItem", "", "tasklist", "name", "", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.victoriagonda.android.tasklist.persistance.Repository repository = null;
    
    public final void saveNewItem(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.Tasklist tasklist, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.victoriagonda.android.tasklist.Tasklist> getTasklist(int id) {
        return null;
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.persistance.Repository repository) {
        super();
    }
}