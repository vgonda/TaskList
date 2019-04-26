package com.victoriagonda.android.tasklist.persistance

import androidx.room.TypeConverter

object StringListConverter {

    @TypeConverter
    @JvmStatic
    fun stringListToString(list: MutableList<String>?): String? =
        list?.joinToString(separator = "|")

    @TypeConverter
    @JvmStatic
    fun stringTostringList(string: String?): MutableList<String>? =
        if (!string.isNullOrBlank()) string?.split("|")?.toMutableList()
        else mutableListOf()
  }