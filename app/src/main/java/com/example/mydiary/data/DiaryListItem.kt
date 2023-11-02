package com.example.mydiary.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "diary_list_item")
data class DiaryListItem(
    @PrimaryKey
    val id:Int? = null,
    val name: String,
    val time: String,
    val allItemsCount: Int,
    val allSelectedItemsCount: Int,

)
