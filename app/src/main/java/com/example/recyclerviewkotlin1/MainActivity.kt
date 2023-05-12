package com.example.recyclerviewkotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABEL="OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.iron,
                nameSuperhero = "Ironman" ,
                descSuperhero = "Skills = Radical beam"
            ),
            Superhero(
                R.drawable.black,
                nameSuperhero = "Black Panther" ,
                descSuperhero = "Skills = Fighter"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain America" ,
                descSuperhero = "Skills = Armor"
            ),
            Superhero(
                R.drawable.deadpool,
                nameSuperhero = "Deadpool" ,
                descSuperhero = "Skills = Regenerations"
            ),
            Superhero(
                R.drawable.doctor,
                nameSuperhero = "Doctor Strange" ,
                descSuperhero = "Skills = Time traveler"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk" ,
                descSuperhero = "Skills = be a Monster"
            ),
            Superhero(
                R.drawable.logan,
                nameSuperhero = "Wolverine" ,
                descSuperhero = "Skills = be a Wolf"
            ),
            Superhero(
                R.drawable.spider,
                nameSuperhero = "Spiderman" ,
                descSuperhero = "be a Spider"
            ),
            Superhero(
                R.drawable.wonder,
                nameSuperhero = "Wonder Woman" ,
                descSuperhero = "Fighter"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val Intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABEL, it)
            startActivity(intent)

        }
    }

}