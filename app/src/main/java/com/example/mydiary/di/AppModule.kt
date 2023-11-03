package com.example.mydiary.di

import android.app.Application
import androidx.room.Room
import com.example.mydiary.data.AddItemReImpl
import com.example.mydiary.data.AddItemRepository
import com.example.mydiary.data.DiaryListItemDao
import com.example.mydiary.data.DiaryListReImpl
import com.example.mydiary.data.DiaryListRepository
import com.example.mydiary.data.MainDB
import com.example.mydiary.data.NoteItemReImpl
import com.example.mydiary.data.NoteItemRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMainDb(app: Application): MainDB {
        return Room.databaseBuilder(
            app,
            MainDB::class.java, "my_diary_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideDiaryRepository(db:MainDB):DiaryListRepository{
        return DiaryListReImpl(db.diaryListItemDao())
    }
    @Provides
    @Singleton
    fun provideAddItemRepository(db:MainDB):AddItemRepository{
        return AddItemReImpl(db.addItemDao())
    }
    @Provides
    @Singleton
    fun provideNoteItemRepository(db:MainDB):NoteItemRepository{
        return NoteItemReImpl(db.noteItemDao())
    }
}