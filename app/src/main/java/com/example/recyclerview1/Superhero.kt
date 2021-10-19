package com.example.recyclerview1

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero : Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable
