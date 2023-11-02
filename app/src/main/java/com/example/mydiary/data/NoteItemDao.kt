package com.example.mydiary.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: NoteItem)
    @Delete
    suspend fun deletetItem(item: NoteItem)
    @Query("SELECT * FROM note_item")
    fun getAllItem(): Flow<List<NoteItem>>
    @Query("SELECT * FROM note_item WHERE id = :id")
    suspend fun getItemById(id:Int): NoteItem
}