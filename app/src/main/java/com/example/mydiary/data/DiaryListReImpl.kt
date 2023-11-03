package com.example.mydiary.data

import kotlinx.coroutines.flow.Flow

class DiaryListReImpl(
    private val dao: DiaryListItemDao
):DiaryListRepository {
    override suspend fun insertItem(item: DiaryListItem) {
        dao.insertItem(item)
    }
    override suspend fun deletetItem(item: DiaryListItem) {
        dao.deletetItem(item)
    }
    override fun getAllItem(): Flow<List<DiaryListItem>> {
      return  dao.getAllItem()
    }
}