package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    val id:Int,
    @StringRes val subjectResourceId:Int,
    @StringRes val descriptionResourceId:Int,
    @DrawableRes val imageResourceId:Int,
    val category: PlaceCategory
)
