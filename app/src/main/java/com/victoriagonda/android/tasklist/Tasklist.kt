package com.victoriagonda.android.tasklist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tasklist(val name: String,
                    val items: List<String>,
                    @PrimaryKey(autoGenerate = true)
                    var id: Int = 0) {

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Tasklist

    if (name != other.name) return false
    if (!items.containsAll(other.items)) return false
    if (!other.items.containsAll(items)) return false
    if (id != other.id) return false

    return true
  }

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + id
    return result
  }
}