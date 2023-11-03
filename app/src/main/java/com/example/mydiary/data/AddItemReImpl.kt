package com.example.mydiary.data

import kotlinx.coroutines.flow.Flow

class AddItemReImpl(
    private val dao: AddItemDao
):AddItemRepository {
    override suspend fun insertItem(item: AddItem) {
        dao.insertItem(item)
    }

    override suspend fun insertItem(item: DiaryListItem) {
        dao.insertItem(item)
    }

    override suspend fun deletetItem(item: AddItem) {
        dao.deletetItem(item)
    }

    override fun getAllItemById(listId: Int): Flow<List<AddItem>> {
       return dao.getAllItemById(listId)
    }

    override suspend fun getItemById(listId: Int): DiaryListItem {
        return dao.getItemById(listId)
    }
}