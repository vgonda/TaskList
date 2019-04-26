package com.victoriagonda.android.tasklist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/victoriagonda/android/tasklist/WishlistAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/victoriagonda/android/tasklist/TaskListViewHolder;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "tasklist", "Landroidx/lifecycle/LiveData;", "", "Lcom/victoriagonda/android/tasklist/Tasklist;", "onItemSelected", "Lkotlin/Function1;", "", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class WishlistAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.victoriagonda.android.tasklist.TaskListViewHolder> {
    private final androidx.lifecycle.LiveData<java.util.List<com.victoriagonda.android.tasklist.Tasklist>> tasklist = null;
    private final kotlin.jvm.functions.Function1<com.victoriagonda.android.tasklist.Tasklist, kotlin.Unit> onItemSelected = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.victoriagonda.android.tasklist.TaskListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.victoriagonda.android.tasklist.TaskListViewHolder holder, int position) {
    }
    
    public WishlistAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.victoriagonda.android.tasklist.Tasklist>> tasklist, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.victoriagonda.android.tasklist.Tasklist, kotlin.Unit> onItemSelected) {
        super();
    }
}