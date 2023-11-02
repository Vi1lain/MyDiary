package com.example.mydiary.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "add_item")
data class AddItem(
    @PrimaryKey
    val id:Int? = null,
    val title:String,
    val subText:String,
    val isCheck:Boolean,
    val listId:Int
    )
