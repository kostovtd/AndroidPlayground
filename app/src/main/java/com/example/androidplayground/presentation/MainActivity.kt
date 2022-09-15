package com.example.androidplayground.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)
    }

    private fun initEvent() {
        binding.newJoke.setOnClickListener {

        }
    }

    private fun render(state: MainState) {
        when(state) {
            is MainState.ResultNewJoke -> binding.jokeText.text = state.data.joke
            is MainState.Loading -> binding.newJoke.isEnabled = false
        }
    }
}