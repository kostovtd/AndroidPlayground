package com.example.androidplayground.data.common

import com.example.androidplayground.domain.dto.JokeDTO

sealed class JokeResult {
    object Loading : JokeResult()

    data class Succcess(val data: List<JokeDTO>) : JokeResult()

    data class Error(val data: String) : JokeResult()
}