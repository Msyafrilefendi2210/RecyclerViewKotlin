package com.example.recyclerviewkotlin1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailSuperheroActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)


        val superhero=intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABEL)

        val imgSuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = findViewById<TextView>(R.id.tv_item_description)

        if (superhero != null) {
            imgSuperhero.setImageResource(superhero.imgSuperhero)
        }
        if (superhero != null) {
            nameSuperhero.text = superhero.nameSuperhero
        }
        if (superhero != null) {
            descSuperhero.text = superhero.descSuperhero
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}