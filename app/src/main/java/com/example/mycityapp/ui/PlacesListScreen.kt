package com.example.mycityapp.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycityapp.R
import com.example.mycityapp.data.LocalPlacesDataProvider
import com.example.mycityapp.model.Place
import com.example.mycityapp.ui.theme.backgroundDark


@Composable
fun PlacesList(
    placesList : List<Place>,
    onClick: (Place) ->Unit,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    modifier: Modifier = Modifier){
    LazyColumn(
        contentPadding = contentPadding,
        modifier = modifier) {
        items(placesList) { place ->
            ListItem(
                place = place,
                onItemClick = {onClick(place)},
                modifier=Modifier.padding(8.dp))
        }
    }
}


@Composable
private fun ListItem(
    modifier: Modifier = Modifier,
    place: Place,
    onItemClick:(Place) -> Unit,
){
    val imageRes = place.imageResourceId
    val subjectRes = place.subjectResourceId
    Card(
        onClick = {onItemClick(place)},
        shape = RectangleShape,
        modifier = modifier,
        ){
        Column {
            Image(
                painter = painterResource(imageRes),
                contentDescription = stringResource(subjectRes),
                modifier = Modifier.fillMaxWidth().height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(subjectRes),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }

}


@Preview
@Composable
private fun ListItemPreview(){
    ListItem(
        place = LocalPlacesDataProvider.defaultPlace,
        onItemClick = {}
    )
}

@Preview
@Composable
private fun PlacesListPreview(){
    val placesList:List<Place> = LocalPlacesDataProvider.allPlaces
    PlacesList(
        placesList,
        onClick = {}
    )
}