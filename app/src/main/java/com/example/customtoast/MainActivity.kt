package com.example.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customtoast.databinding.ActivityMainBinding
import com.shashank.sony.fancytoastlib.FancyToast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDefault.setOnClickListener {
            FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.DEFAULT,true).show()
        }
        binding.buttonFancy.setOnClickListener {
            FancyToast.makeText(this,"Hello 😍",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show()
        }
    }
}