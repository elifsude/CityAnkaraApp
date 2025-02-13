package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.CategoryCardContent
import com.example.mycityapp.model.Place
import com.example.mycityapp.model.PlaceCategory

object CategoryCardsDataProvider {
    fun getCategoryCardsData(): List<CategoryCardContent> {
        return listOf(
            CategoryCardContent(
                id = 1,
                imageResId = R.drawable.touristic,
                titleResId = R.string.categoryTouristic,
                category = PlaceCategory.TOURISTIC
            ),
            CategoryCardContent(
                id = 2,
                imageResId = R.drawable.park,
                titleResId = R.string.categoryPark,
                category = PlaceCategory.PARK
            ),
            CategoryCardContent(
                id = 3,
                imageResId = R.drawable.shoppingmall,
                titleResId = R.string.categoryAvm,
                category = PlaceCategory.AVM
            ),
            CategoryCardContent(
                id = 4,
                imageResId = R.drawable.restaurant,
                titleResId = R.string.categoryRestaurant,
                category = PlaceCategory.RESTAURANT
            ),
            CategoryCardContent(
                id = 5,
                imageResId = R.drawable.cafe,
                titleResId = R.string.categoryCafe,
                category = PlaceCategory.CAFE
            ),

        )
    }
}