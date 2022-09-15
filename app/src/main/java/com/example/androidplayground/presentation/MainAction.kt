package com.example.androidplayground.presentation

sealed class MainAction: ViewAction {
    object FetchNewJoke: MainAction()
}