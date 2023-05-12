package com.example.recyclerviewkotlin1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String
): Parcelable