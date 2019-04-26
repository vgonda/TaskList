package com.victoriagonda.android.tasklist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.view_input_bottom_sheet.view.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

  private val viewModel: MainViewModel by viewModel()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = TasklistAdapter(this, viewModel.getTasklists()) {
      startActivity(DetailActivity.newIntent(it, this))
    }

    buttonAddList.setOnClickListener { showAddListInput() }
  }

  private fun showAddListInput() {
    BottomSheetDialog(this).apply {
      val view = layoutInflater.inflate(R.layout.view_input_bottom_sheet, null)
      view.title.text = getString(R.string.list_title)
      view.buttonSave.setOnClickListener {
        viewModel.saveNewList(view.editTextInput.text.toString())
        this.dismiss()
      }
      setContentView(view)
      show()
    }
  }
}