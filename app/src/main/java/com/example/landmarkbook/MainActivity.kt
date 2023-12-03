package com.example.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook.databinding.ActivityDetailsActivtyBinding
import com.example.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val eifel = Landmark("Eifel","France",R.drawable.eifel)
        val collessium = Landmark("Collessium","Italy",R.drawable.collessium)
        val londonBridge = Landmark("London Bridge","United Kingdom",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(eifel)
        landmarkList.add(collessium)
        landmarkList.add(londonBridge)

        binding.rvLandmark.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.rvLandmark.adapter = landmarkAdapter

    }







}