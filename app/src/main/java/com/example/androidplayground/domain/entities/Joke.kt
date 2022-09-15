package com.example.androidplayground.domain.entities

import com.example.androidplayground.domain.common.JokeFlags
import com.example.androidplayground.domain.common.JokeType

data class Joke(
    val category: String? = null,
    val type: JokeType,
    val joke: String? = null,
    val setup: String? = null,
    val delivery: String? = null,
    val flags: JokeFlags? = null
)