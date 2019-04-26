package com.victoriagonda.android.tasklist

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_list_detail.*
import kotlinx.android.synthetic.main.view_input_bottom_sheet.view.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailActivity : AppCompatActivity() {

  companion object {
    private const val EXTRA_TASKLIST = "EXTRA_TASKLIST"

    fun newIntent(tasklist: Tasklist, context: Context): Intent {
      return Intent(context, DetailActivity::class.java)
          .apply {
            putExtra(EXTRA_TASKLIST, tasklist.id)
          }
    }
  }

  private val viewModel: DetailViewModel by viewModel()
  private val taskItemAdapter: TaskItemAdapter = TaskItemAdapter()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_list_detail)
    recyclerTasks.layoutManager = GridLayoutManager(this, 2)
    recyclerTasks.adapter = taskItemAdapter
    viewModel.getTasklist(intent.getIntExtra(EXTRA_TASKLIST, 0)).observe(this, Observer {
      render(it)
    })
  }

  private fun render(tasklist: Tasklist) {
    textViewTitle.text = tasklist.name
    taskItemAdapter.items.clear()
    taskItemAdapter.items.addAll(tasklist.items)
    taskItemAdapter.notifyDataSetChanged()

    buttonAddList.setOnClickListener { showAddListInput(tasklist) }
  }

  private fun showAddListInput(tasklist: Tasklist) {
    BottomSheetDialog(this).apply {
      val view = layoutInflater.inflate(R.layout.view_input_bottom_sheet, null)
      view.title.text = getString(R.string.title_add_item)
      view.buttonSave.setOnClickListener {
        viewModel.saveNewItem(tasklist, view.editTextInput.text.toString())
        this.dismiss()
      }
      setContentView(view)
      show()
    }
  }
}
