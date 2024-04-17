package com.example.dictionaryapp.presentation

import com.example.dictionaryapp.domain.models.WordItem

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",
    val wordItem: WordItem?= null
)