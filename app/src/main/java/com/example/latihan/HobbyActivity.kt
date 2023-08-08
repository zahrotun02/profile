package com.example.latihan

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbyActivity : AppCompatActivity() {

    lateinit var hobbyview:RecyclerView
    lateinit var hobbyAdapter: HobbyAdapter
    val list = ArrayList<HobbyData>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        hobbyview = findViewById(R.id.rvHobby)
        hobbyview.layoutManager = LinearLayoutManager( this)

        list.add(HobbyData("Menulis","menulis diary"))
        list.add(HobbyData("Mendengarkan music","always mendengarkan lagu sad wkwkw"))
        list.add(HobbyData("Membaca","wattpad"))

        hobbyAdapter = HobbyAdapter(list)
        hobbyview.adapter = hobbyAdapter

    }
}