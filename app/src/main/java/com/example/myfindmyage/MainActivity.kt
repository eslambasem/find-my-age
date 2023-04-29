package com.example.myfindmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.myfindmyage.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bt.setOnClickListener {
            val brith: Int = binding.et.text.toString().toInt()
            val currentYear =Calendar.getInstance().get(Calendar.YEAR)
            val age =currentYear-brith
            binding.tv.text="your year"+age

        }
    }
}