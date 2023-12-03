package com.example.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landmarkbook.databinding.ActivityDetailsActivtyBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsActivtyBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsActivtyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent

        var landMark = intent.getSerializableExtra("landmark") as Landmark

        binding.countryText.text = landMark.country
        binding.nameText.text = landMark.name
        binding.imageView.setImageResource(landMark.image)

    }








}