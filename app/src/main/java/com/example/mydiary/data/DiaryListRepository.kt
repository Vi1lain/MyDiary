package com.example.mydiary.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface DiaryListRepository {
    suspend fun insertItem(item: DiaryListItem)
    suspend fun deletetItem(item: DiaryListItem)
    fun getAllItem(): Flow<List<DiaryListItem>>
}