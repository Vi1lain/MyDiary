package com.example.mydiary.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        DiaryListItem::class,
        NoteItem::class,
        AddItem::class,
    ], version = 1
)
abstract class MainDB : RoomDatabase() {
    abstract fun diaryListItemDao(): DiaryListItemDao
    abstract fun noteItemDao(): NoteItemDao
    abstract fun addItemDao(): AddItemDao
}