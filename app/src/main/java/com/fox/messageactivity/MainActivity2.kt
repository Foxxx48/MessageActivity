package com.fox.messageactivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fox.messageactivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private var _binding: ActivityMain2Binding? = null
    private val binding
        get() = _binding ?: throw RuntimeException("ActivityMain2Binding = null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ac2Tv.text = intent.getStringExtra(EXTRAS)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val EXTRAS = "extras"
        fun newIntent(context: Context, str: String): Intent {
            return Intent(context, MainActivity2::class.java).apply {
                putExtra(EXTRAS, str)
            }
        }
    }
}