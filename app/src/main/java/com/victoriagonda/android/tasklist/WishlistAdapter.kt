package com.victoriagonda.android.tasklist

import android.content.Context
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_tasklist.view.*






class TasklistAdapter(lifecycleOwner: LifecycleOwner,
                      private val tasklist: LiveData<List<Tasklist>>,
                      private val onItemSelected: (Tasklist) -> Unit) :
    RecyclerView.Adapter<TaskListViewHolder>() {

  init {
    tasklist.observe(lifecycleOwner, Observer { notifyDataSetChanged() })
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListViewHolder {
    return TaskListViewHolder(LayoutInflater.from(parent.context)
        .inflate(R.layout.item_tasklist, parent, false), onItemSelected)
  }

  override fun getItemCount(): Int {
    return tasklist.value?.size ?: 0
  }

  override fun onBindViewHolder(holder: TaskListViewHolder, position: Int) {
    tasklist.value?.get(position)?.let { holder.bind(it) }
  }
}

class TaskListViewHolder(val view: View, val onItemSelected: (Tasklist) -> Unit) :
    RecyclerView.ViewHolder(view) {

  private val taskItemAdapter = TaskItemAdapter()

  init {
    view.recyclerTasks.layoutManager = LinearLayoutManager(view.context)
    view.recyclerTasks.adapter = taskItemAdapter
  }

  fun bind(tasklist: Tasklist) {
    view.title.text = tasklist.name
    view.setOnClickListener {
      onItemSelected(tasklist)
    }
    taskItemAdapter.items.clear()
    taskItemAdapter.items.addAll(tasklist.items)
    taskItemAdapter.notifyDataSetChanged()
  }
}

class TaskItemAdapter : RecyclerView.Adapter<TaskViewHolder>() {

  val items: MutableList<String> = mutableListOf()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
    return TaskViewHolder(TextView(parent.context).apply {
      textSize = 18f
      val horizontalPadding = dpToPx(16f, parent.context)
      val verticalPadding = dpToPx(8f, parent.context)
      setPadding(horizontalPadding, verticalPadding, horizontalPadding, verticalPadding)
    })
  }

  fun dpToPx(dp: Float, context: Context): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.resources.displayMetrics).toInt()
  }

  fun spToPx(sp: Float, context: Context): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, context.resources.displayMetrics).toInt()
  }

  override fun getItemCount(): Int {
    return items.size
  }

  override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
    holder.bind(items[position])
  }

}

class TaskViewHolder(val view: TextView) : RecyclerView.ViewHolder(view) {
  fun bind(item: String) {
    view.text = item
  }
}

