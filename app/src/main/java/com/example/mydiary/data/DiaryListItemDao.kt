package com.example.mydiary.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DiaryListItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: DiaryListItem)
    @Delete
    suspend fun deletetItem(item: DiaryListItem)
    @Query("SELECT * FROM diary_list_item")
    fun getAllItem(): Flow<List<DiaryListItem>>

}