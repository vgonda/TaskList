package com.victoriagonda.android.tasklist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/victoriagonda/android/tasklist/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "taskItemAdapter", "Lcom/victoriagonda/android/tasklist/TaskItemAdapter;", "viewModel", "Lcom/victoriagonda/android/tasklist/DetailViewModel;", "getViewModel", "()Lcom/victoriagonda/android/tasklist/DetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "render", "tasklist", "Lcom/victoriagonda/android/tasklist/Tasklist;", "showAddListInput", "Companion", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.victoriagonda.android.tasklist.TaskItemAdapter taskItemAdapter = null;
    private static final java.lang.String EXTRA_TASKLIST = "EXTRA_TASKLIST";
    public static final com.victoriagonda.android.tasklist.DetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.victoriagonda.android.tasklist.DetailViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void render(com.victoriagonda.android.tasklist.Tasklist tasklist) {
    }
    
    private final void showAddListInput(com.victoriagonda.android.tasklist.Tasklist tasklist) {
    }
    
    public DetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/victoriagonda/android/tasklist/DetailActivity$Companion;", "", "()V", "EXTRA_TASKLIST", "", "newIntent", "Landroid/content/Intent;", "tasklist", "Lcom/victoriagonda/android/tasklist/Tasklist;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        com.victoriagonda.android.tasklist.Tasklist tasklist, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}