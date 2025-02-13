package com.example.mycityapp.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycityapp.R
import com.example.mycityapp.ui.theme.MyCityAppTheme

@Composable
fun DetailsScreen(
    imageRes : Int,
    subjectRes: Int,
    descriptionRes:Int,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(contentPadding)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Image(
            painter = painterResource(imageRes),
            contentDescription = stringResource(subjectRes),
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_detail_content_vertical)))
        Box (
            modifier = Modifier.fillMaxWidth(),
        ){
            Text(
                text = stringResource(descriptionRes),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 30.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.displaySmall
            )
        }
    }
}

