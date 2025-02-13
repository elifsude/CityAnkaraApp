package com.example.mycityapp.model

import com.example.mycityapp.R

enum class PlaceCategory (
    val nameRes : Int
){
    AVM(R.string.categoryAvm),
    TOURISTIC(R.string.categoryTouristic),
    CAFE(R.string.categoryCafe),
    RESTAURANT(R.string.categoryRestaurant),
    PARK(R.string.categoryPark)
}
