package com.example.mydiary.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface NoteItemRepository {

    suspend fun insertItem(item: NoteItem)

    suspend fun deletetItem(item: NoteItem)

    fun getAllItem(): Flow<List<NoteItem>>

    suspend fun getItemById(id:Int): NoteItem
}