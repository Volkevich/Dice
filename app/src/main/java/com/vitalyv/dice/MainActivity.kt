package com.vitalyv.dice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.vitalyv.dice.databinding.ActivityMainBinding
import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.generatedButton.setOnClickListener{
            onGenerationsClick()
        }
    }

    @SuppressLint("ResourceType")
    private fun onGenerationsClick() {
        binding.rootLayout?.setBackgroundResource(R.drawable.new_background)
        val randomNumber = Random.nextInt(1, 7)

        when (randomNumber) {
            1 -> binding.imageView?.setImageResource(R.drawable.dice1)
            2 -> binding.imageView?.setImageResource(R.drawable.dice2)
            3 -> binding.imageView?.setImageResource(R.drawable.dice3)
            4 -> binding.imageView?.setImageResource(R.drawable.dice4)
            5 -> {
                binding.imageView?.let {
                    Glide.with(this)
                        .asGif()
                        .load(R.raw.dicpefive)
                        .into(it)
                }
            }
            6 -> binding.imageView?.setImageResource(R.drawable.dice6)
            }
        }
    }



