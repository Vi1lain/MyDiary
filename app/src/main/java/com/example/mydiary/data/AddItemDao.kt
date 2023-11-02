package com.example.mydiary.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AddItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: AddItem)
    @Delete
    suspend fun deletetItem(item: AddItem)
    @Query("SELECT * FROM add_item WHERE listId = :listId")
    fun getAllItemById(listId:Int): Flow<List<AddItem>>
    @Query("SELECT * FROM diary_list_item WHERE id = :listId")
    suspend fun getItemById(listId:Int): DiaryListItem
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: DiaryListItem)
}