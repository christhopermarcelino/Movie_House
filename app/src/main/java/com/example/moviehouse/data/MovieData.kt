package com.example.moviehouse.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieData(
    val image: Int
) : Parcelable
