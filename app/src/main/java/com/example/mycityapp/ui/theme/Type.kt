package com.example.mycityapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mycityapp.R

val AbrilFatFace = FontFamily(
    Font(R.font.abrilfatface_regular)
)
val MontSerrat = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_bold,FontWeight.Bold)
)
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = AbrilFatFace,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    displaySmall = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    )

)