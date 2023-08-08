package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationview: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationview = findViewById(R.id.rvEducation)
        educationview.layoutManager = LinearLayoutManager( this)

        list.add(SchoolData("RA Tunas Bangsa","Dukuh Badong-Sidogemah, Kec.Sayung,Kab Demak"))
        list.add(SchoolData("SDN SIDOGEMAH 1","Dukuh Badong-Sidogemah, Kec.Sayung,Kab Demak"))
        list.add(SchoolData("MTS NURUL HUDA","Dukuh Badong-Sidogemah, Kec.Sayung,Kab.Demak"))
        list.add(SchoolData("SMKN 1 SAYUNG","Jl.Raya Semarang-Demak Km.14 Onggorawe, Kec.Sayung,Kab.Demak"))

        educationAdapter = SchoolAdapter(list)
        educationview.adapter = educationAdapter
    }
}