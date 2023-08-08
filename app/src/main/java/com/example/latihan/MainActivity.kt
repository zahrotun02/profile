package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnProfile: CardView = findViewById(R.id.profile)
        val btnPortopolio: CardView = findViewById(R.id.portopolio)
        val btnSkill: CardView = findViewById(R.id.skill)
        val btnEducation: CardView = findViewById(R.id.education)
        val btnHobi: CardView = findViewById(R.id.hobi)

        btnProfile.setOnClickListener {
            val intent = Intent( this, profilActivity::class.java)
            startActivity(intent)
        }

        btnPortopolio.setOnClickListener {
           val intent = Intent( this, PortofolioActivity::class.java)
            startActivity(intent)
        }

        btnSkill.setOnClickListener {
            val intent = Intent( this, SkillActivity::class.java)
            startActivity(intent)
        }

        btnEducation.setOnClickListener {
            val intent = Intent( this, EducationActivity::class.java)
            startActivity(intent)
        }

        btnHobi.setOnClickListener {
            val intent = Intent( this, HobbyActivity::class.java)
            startActivity(intent)
        }

    }
}