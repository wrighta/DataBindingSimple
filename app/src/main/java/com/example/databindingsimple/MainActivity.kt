package com.example.databindingsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingsimple.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // note when using data binding we call setContentView differently
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        Toast.makeText(this, binding.textBox.text, Toast.LENGTH_SHORT).show()

        binding.textBox.setOnClickListener{
            Toast.makeText(this, binding.textBox.text, Toast.LENGTH_SHORT).show()
        }
    }
}