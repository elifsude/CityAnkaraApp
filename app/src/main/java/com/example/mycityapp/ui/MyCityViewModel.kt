package com.example.mycityapp.ui

import android.util.Log
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R
import com.example.mycityapp.data.LocalPlacesDataProvider
import com.example.mycityapp.model.CurrentScreen
import com.example.mycityapp.model.Place
import com.example.mycityapp.model.PlaceCategory
import com.example.mycityapp.ui.MyCityUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MyCityViewModel: ViewModel(){
    private val _uiState = MutableStateFlow(MyCityUiState())
    val uiState: StateFlow<MyCityUiState> = _uiState
    init {
        initializeUIState()
    }
    private fun initializeUIState(){
        val places: Map<PlaceCategory, List<Place>> =
            LocalPlacesDataProvider.allPlaces.groupBy { it.category }
        _uiState.value = MyCityUiState(
            topBarTitle = R.string.mainTitle,
            places = places,
            selectedCategory = PlaceCategory.TOURISTIC,
            selectedPlace = places[PlaceCategory.TOURISTIC]?.get(0) ?: LocalPlacesDataProvider.defaultPlace,
            currentScreen = CurrentScreen.CATEGORIES
        )
    }
    fun goToScreen(
        screen: CurrentScreen
    ){
        _uiState.update {
            it.copy(
                currentScreen = screen
            )
        }
    }

    fun goBack(){
        if (_uiState.value.currentScreen == CurrentScreen.DETAILS){
            _uiState.update {
                it.copy(
                    topBarTitle = _uiState.value.selectedCategory.nameRes,
                    currentScreen = CurrentScreen.PLACES
                )
            }
        }else{
            _uiState.update {
                it.copy(
                    topBarTitle = R.string.mainTitle,
                    currentScreen = CurrentScreen.CATEGORIES
                )
            }
        }
    }
    fun goBackWhenExpanded(){
        _uiState.update {
            it.copy(
                topBarTitle = R.string.mainTitle,
                currentScreen = CurrentScreen.CATEGORIES
            )
        }
    }

    fun updateCategory(
        category: PlaceCategory
    ){
        val title = category.nameRes
        _uiState.update {
            it.copy(
                topBarTitle = title,
                selectedCategory = category,
            )
        }
        updateSelectedPlace(_uiState.value.currentCategoryPlaces.get(0))
    }

    fun updateSelectedPlace(
        place: Place
    ){
        val title = place.subjectResourceId
        _uiState.update {
            it.copy(
                topBarTitle = title,
                selectedPlace = place
            )
        }
    }

}