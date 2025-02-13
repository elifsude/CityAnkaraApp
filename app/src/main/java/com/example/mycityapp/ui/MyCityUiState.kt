package com.example.mycityapp.ui

import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.example.mycityapp.R
import com.example.mycityapp.data.LocalPlacesDataProvider
import com.example.mycityapp.model.CurrentScreen
import com.example.mycityapp.model.Place
import com.example.mycityapp.model.PlaceCategory

data class MyCityUiState (
    @StringRes val topBarTitle : Int = R.string.mainTitle,
    val places: Map<PlaceCategory, List<Place>> = emptyMap(),
    val currentScreen : CurrentScreen = CurrentScreen.CATEGORIES,
    val selectedPlace : Place = LocalPlacesDataProvider.defaultPlace,
    val selectedCategory : PlaceCategory = PlaceCategory.TOURISTIC,
    ){
        val currentCategoryPlaces: List<Place> by lazy { places[selectedCategory]!! }
}