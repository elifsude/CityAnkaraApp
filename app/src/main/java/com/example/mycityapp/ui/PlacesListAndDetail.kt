package com.example.mycityapp.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mycityapp.model.Place

@Composable
fun PlacesListAndDetail(
    modifier:Modifier = Modifier,
    contentPadding :PaddingValues,
    placesList: List<Place>,
    onClick : (Place) ->Unit,
    place : Place
){
    Row {
        PlacesList(
            onClick = {onClick(it)},
            placesList = placesList,
            modifier = Modifier.weight(1f),
            contentPadding = contentPadding
        )
        DetailsScreen(
            subjectRes = place.subjectResourceId,
            descriptionRes = place.descriptionResourceId,
            imageRes = place.imageResourceId,
            modifier = Modifier.weight(1f),
            contentPadding = contentPadding
        )
    }
}