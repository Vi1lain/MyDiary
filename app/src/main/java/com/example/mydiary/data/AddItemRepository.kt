package com.example.mydiary.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface AddItemRepository{

    suspend fun insertItem(item: AddItem)

    suspend fun deletetItem(item: AddItem)

    fun getAllItemById(listId:Int): Flow<List<AddItem>>

    suspend fun getItemById(listId:Int): DiaryListItem

    suspend fun insertItem(item: DiaryListItem)
}