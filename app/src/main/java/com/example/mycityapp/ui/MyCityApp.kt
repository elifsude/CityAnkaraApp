package com.example.mycityapp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycityapp.R
import com.example.mycityapp.data.CategoryCardsDataProvider
import com.example.mycityapp.model.CurrentScreen

@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier:Modifier = Modifier,
){
    val viewModel: MyCityViewModel = viewModel()
    val myCityUiState = viewModel.uiState.collectAsState().value
    if (windowSize != WindowWidthSizeClass.Expanded) {
        Scaffold(
            topBar = {
                MyCityAppBar(
                    onBackButtonClick = {viewModel.goBack()},
                    title = myCityUiState.topBarTitle,
                )
            }
        ) { innerPadding ->
            when (myCityUiState.currentScreen) {
                CurrentScreen.CATEGORIES -> {
                    val categoryList = CategoryCardsDataProvider.getCategoryCardsData()
                    CategoryList(
                        categoriesList = categoryList,
                        onClick = {
                            viewModel.updateCategory(it)
                            viewModel.goToScreen(CurrentScreen.PLACES)
                        },
                        contentPadding = innerPadding
                    )
                }
                CurrentScreen.PLACES -> {
                    PlacesList(
                        placesList = myCityUiState.currentCategoryPlaces,
                        onClick = {
                            viewModel.updateSelectedPlace(it)
                            viewModel.goToScreen(CurrentScreen.DETAILS)
                        },
                        contentPadding = innerPadding
                    )
                }

                CurrentScreen.DETAILS -> {
                    DetailsScreen(
                        subjectRes = myCityUiState.selectedPlace.subjectResourceId,
                        descriptionRes = myCityUiState.selectedPlace.descriptionResourceId,
                        imageRes = myCityUiState.selectedPlace.imageResourceId,
                        contentPadding = innerPadding
                    )
                }
            }
        }
    }else{
        Scaffold(
            topBar = {
                MyCityAppBar(
                    onBackButtonClick = {viewModel.goBackWhenExpanded()},
                    title = myCityUiState.topBarTitle,
                )
            }
        ){ innerPadding->
            when (myCityUiState.currentScreen) {
                CurrentScreen.CATEGORIES -> {
                    val categoryList = CategoryCardsDataProvider.getCategoryCardsData()
                    CategoryList(
                        categoriesList = categoryList,
                        onClick = {
                            viewModel.updateCategory(it)
                            viewModel.goToScreen(CurrentScreen.PLACES)
                        },
                        contentPadding = innerPadding
                    )
                }
                else -> {
                    PlacesListAndDetail(
                        contentPadding = innerPadding,
                        onClick = {
                            viewModel.updateSelectedPlace(it)
                            viewModel.goToScreen(CurrentScreen.DETAILS)
                        },
                        place = myCityUiState.selectedPlace,
                        placesList = myCityUiState.currentCategoryPlaces
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityAppBar(
    onBackButtonClick: () -> Unit,
    title:Int,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(title),
                style =if(title == R.string.mainTitle) {
                    MaterialTheme.typography.displayLarge
                }else{
                    MaterialTheme.typography.displayMedium
                }
            )
        },
        navigationIcon = if (title != R.string.mainTitle) {
            {
                IconButton(onClick = onBackButtonClick) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        } else {
            { Box {} }
        },
        /*colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),*/
        modifier = modifier,
    )
}