package com.example.mycityapp.ui

import android.graphics.pdf.models.ListItem
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycityapp.R
import com.example.mycityapp.data.CategoryCardsDataProvider
import com.example.mycityapp.model.CategoryCardContent
import com.example.mycityapp.model.Place
import com.example.mycityapp.model.PlaceCategory


@Composable
fun CategoryList(
    categoriesList : List<CategoryCardContent>,
    onClick : (PlaceCategory) -> Unit,
    modifier: Modifier=Modifier,
    contentPadding:PaddingValues = PaddingValues(0.dp),
){
    LazyColumn(
        contentPadding = contentPadding,
        modifier = modifier,) {
        items(categoriesList) { category ->
            CategoryListItem(
                categoryNameRes = category.titleResId,
                categoryImageRes = category.imageResId,
                category = category.category,
                onItemClick = {onClick(category.category)}
            )
        }
    }
}

@Composable
private fun CategoryListItem(
    category: PlaceCategory,
    categoryNameRes :Int,
    categoryImageRes : Int,
    onItemClick: (PlaceCategory) -> Unit,
    modifier:Modifier = Modifier
){
    Card(
        modifier = modifier,
        shape = RectangleShape,
        onClick = {onItemClick(category)}
    ){
        Box(
            modifier = modifier.height(150.dp)
        ) {
            Image(
                painter = painterResource(categoryImageRes),
                contentDescription = stringResource(categoryNameRes),
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.3f)) // 0.5 opaklıkta siyah katman
            )
            Text(
                text = stringResource(categoryNameRes),
                color = Color.White,
                fontSize = 50.sp,//matterial theme ile ayar çekilcek
                fontWeight = FontWeight.Bold, // italicde olcak
                modifier = Modifier.align(Alignment.Center).padding(dimensionResource(R.dimen.padding_medium))
            )
        }
    }
}

@Preview
@Composable
private fun CategoryListItemPreview(){
    CategoryListItem(
        categoryImageRes = R.drawable.touristic,
        categoryNameRes = R.string.categoryTouristic,
        category = PlaceCategory.TOURISTIC,
        onItemClick = {}
    )
}

@Preview
@Composable
private fun CategoryListPreview(){
    val categoryList = CategoryCardsDataProvider.getCategoryCardsData()
    CategoryList(
        categoryList,
        onClick = {},
        )
}