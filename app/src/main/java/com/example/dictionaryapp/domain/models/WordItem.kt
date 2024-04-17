package com.example.dictionaryapp.domain.models

data class WordItem(
    val word: String ,
    val meanings: List<Meaning>,
    val phonetic: String
)