package com.example.mydiary.diary_list_screen

import androidx.lifecycle.ViewModel
import com.example.mydiary.data.DiaryListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DiaryListViewModel @Inject constructor(
    private val repository: DiaryListRepository
) : ViewModel() {

}