package com.example.dictionaryapp.domain.repository

import com.example.dictionaryapp.data.dto.WordResultDto
import com.example.dictionaryapp.domain.models.WordItem
import com.example.dictionaryapp.util.Result
import kotlinx.coroutines.flow.Flow

interface DictionaryRepository {
    suspend fun getWord(
        word: String
    ) : Flow<Result<WordItem>>
}