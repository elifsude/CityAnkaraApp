package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CategoryCardContent(
    val id:Int,
    @StringRes val titleResId : Int,
    @DrawableRes val imageResId : Int,
    val category: PlaceCategory
)
