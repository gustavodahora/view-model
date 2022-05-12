package dev.gustavodahora.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import dev.gustavodahora.viewmodel.databinding.ActivityMainBinding
import dev.gustavodahora.viewmodel.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.tvIncreasingNumber.text = viewModel.number.toString()

        binding.btnIncreaseButton.setOnClickListener {
            viewModel.addNumber()
            binding.tvIncreasingNumber.text = viewModel.number.toString()
        }
    }
}