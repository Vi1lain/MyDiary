package com.example.mydiary.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_item")
data class NoteItem(
    @PrimaryKey
    val id:Int? = null,
    val title:String,
    val descripiton:String,
    val time:String
    )
