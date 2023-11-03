package com.example.mydiary.data

import kotlinx.coroutines.flow.Flow

class NoteItemReImpl(private val dao: NoteItemDao):NoteItemRepository {
    override suspend fun insertItem(item: NoteItem) {
        dao.insertItem(item)
    }

    override suspend fun deletetItem(item: NoteItem) {
        dao.deletetItem(item)
    }

    override fun getAllItem(): Flow<List<NoteItem>> {
        return  dao.getAllItem()
    }

    override suspend fun getItemById(id: Int): NoteItem {
        return dao.getItemById(id)
    }
}