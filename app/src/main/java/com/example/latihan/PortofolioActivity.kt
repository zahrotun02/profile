package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(
            PortofolioData(
            R.drawable.web, "pendaftaran-siswa",
            "Project pendaftaran siswa", "https://github.com/zahrotun02/pendaftaran-siswa"
        )
        )

        listPortofolio.add(PortofolioData(
            R.drawable.web, "projek-tugas-STS",
            "Project tugas STS", "https://github.com/zahrotun02/projek-tugas-STS"
        ))

       portofolioView = findViewById(R.id.rvPortofolio)
       portofolioView.layoutManager = LinearLayoutManager(this)

       portofolioAdapter = PortofolioAdapter(listPortofolio)
       portofolioAdapter.notifyDataSetChanged()
       portofolioView.adapter = portofolioAdapter


    }
}