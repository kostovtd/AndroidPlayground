package com.example.androidplayground.domain.dto

import com.example.androidplayground.domain.common.JokeFlags
import com.example.androidplayground.domain.common.JokeType

data class JokeDTO(
    val error: String? = null,
    val category: String? = null,
    val type: JokeType,
    val joke: String? = null,
    val setup: String? = null,
    val delivery: String? = null,
    val flags: JokeFlags? = null,
    val id: Int? = null,
    val safe: Boolean,
    val lang: String? = null
)