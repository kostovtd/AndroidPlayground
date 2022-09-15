package com.example.androidplayground.presentation

import com.example.androidplayground.domain.entities.Joke

sealed class MainState : ViewState {
    object Loading : MainState()
    data class ResultNewJoke(val data: Joke) : MainState()
}
