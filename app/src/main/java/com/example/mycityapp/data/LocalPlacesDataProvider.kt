package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Place
import com.example.mycityapp.model.PlaceCategory

object LocalPlacesDataProvider {
        val allPlaces = listOf(
            Place(
                id = 1,
                subjectResourceId = R.string.ahlatlibelsubject,
                descriptionResourceId = R.string.ahlatlibelbody,
                imageResourceId = R.drawable.ahlatlibel,
                category = PlaceCategory.PARK
            ),
            Place(
                id = 2,
                subjectResourceId = R.string.ameliessubject,
                descriptionResourceId = R.string.ameliebody,
                imageResourceId = R.drawable.ameliesgarden,
                category = PlaceCategory.CAFE
            ),
            Place(
                id = 3,
                subjectResourceId = R.string.andsubject,
                descriptionResourceId = R.string.andbody,
                imageResourceId = R.drawable.andcafe,
                category = PlaceCategory.CAFE
            ),
            Place(
                id = 4,
                subjectResourceId = R.string.anfasubject,
                descriptionResourceId = R.string.anfabody,
                imageResourceId = R.drawable.anfaaltinpark,
                category = PlaceCategory.PARK
            ),
            Place(
                id = 5,
                subjectResourceId = R.string.anitkabirsubject,
                descriptionResourceId = R.string.anitkabirbody,
                imageResourceId = R.drawable.anitkabir,
                category = PlaceCategory.TOURISTIC
            ),
            Place(
                id = 6,
                subjectResourceId = R.string.ankamalsubject,
                descriptionResourceId = R.string.ankamalbody,
                imageResourceId = R.drawable.ankamall,
                category = PlaceCategory.AVM
            ),
            Place(
                id = 7,
                subjectResourceId = R.string.ankaracastlesubject,
                descriptionResourceId = R.string.ankaracastlebody,
                imageResourceId = R.drawable.ankaracastle,
                category = PlaceCategory.TOURISTIC
            ),
            Place(
                id = 8,
                subjectResourceId = R.string.armadasubject,
                descriptionResourceId = R.string.armadabody,
                imageResourceId = R.drawable.armadaa,
                category = PlaceCategory.AVM
            ),
            Place(
                id = 9,
                subjectResourceId = R.string.atakulesubject,
                descriptionResourceId = R.string.atakulebody,
                imageResourceId = R.drawable.atakule,
                category = PlaceCategory.TOURISTIC
            ),
            Place(
                id = 10,
                subjectResourceId = R.string.bayramustakebabsubject,
                descriptionResourceId = R.string.bayramustakebabbody,
                imageResourceId = R.drawable.bayramustakebab,
                category = PlaceCategory.RESTAURANT
            ),
            Place(
                id = 11,
                subjectResourceId = R.string.cafedescafessubject,
                descriptionResourceId = R.string.cafedescafesbody,
                imageResourceId = R.drawable.cafedescaes,
                category = PlaceCategory.CAFE
            ),
            Place(
                id = 12,
                subjectResourceId = R.string.cafemizsubject,
                descriptionResourceId = R.string.cafemizbody,
                imageResourceId = R.drawable.cafemiz,
                category = PlaceCategory.CAFE
            ),
            Place(
                id = 13,
                subjectResourceId = R.string.eymirsubject,
                descriptionResourceId = R.string.eymirbody,
                imageResourceId = R.drawable.eymir,
                category = PlaceCategory.PARK
            ),
            Place(
                id = 14,
                subjectResourceId = R.string.göksusubject,
                descriptionResourceId = R.string.göksubody,
                imageResourceId = R.drawable.goksu,
                category = PlaceCategory.PARK
            ),
            Place(
                id = 15,
                subjectResourceId = R.string.gordionsubject,
                descriptionResourceId = R.string.gordionbody,
                imageResourceId = R.drawable.gordion,
                category = PlaceCategory.AVM
            ),
            Place(
                id = 16,
                subjectResourceId = R.string.hacibayramcamisubject,
                descriptionResourceId = R.string.hacibayramcamibody,
                imageResourceId = R.drawable.hacibayramcami,
                category = PlaceCategory.TOURISTIC
            ),
            Place(
                id = 17,
                subjectResourceId = R.string.hamamonusubject,
                descriptionResourceId = R.string.hamamonubody,
                imageResourceId = R.drawable.hamamonu,
                category = PlaceCategory.TOURISTIC
            ),
            Place(
                id = 18,
                subjectResourceId = R.string.kafessubject,
                descriptionResourceId = R.string.kafesbody,
                imageResourceId = R.drawable.kafescoffebakery,
                category = PlaceCategory.CAFE
            ),
            Place(
                id = 19,
                subjectResourceId = R.string.karumsubject,
                descriptionResourceId = R.string.karumbody,
                imageResourceId = R.drawable.karum,
                category = PlaceCategory.AVM
            ),
            Place(
                id = 20,
                subjectResourceId = R.string.kiritsubject,
                descriptionResourceId = R.string.kiritbody,
                imageResourceId = R.drawable.kiritcafe,
                category = PlaceCategory.CAFE
            ),
            Place(
                id = 21,
                subjectResourceId = R.string.kocatepecamisubject,
                descriptionResourceId = R.string.kocatepecamibody,
                imageResourceId = R.drawable.kocatepecami,
                category = PlaceCategory.TOURISTIC
            ),
            Place(
                id = 22,
                subjectResourceId = R.string.lagiogasubject,
                descriptionResourceId = R.string.lagiogabody,
                imageResourceId = R.drawable.lagioga,
                category = PlaceCategory.RESTAURANT
            ),
            Place(
                id = 23,
                subjectResourceId = R.string.lavaresubject,
                descriptionResourceId = R.string.lavarebody,
                imageResourceId = R.drawable.lavarestreet,
                category = PlaceCategory.RESTAURANT
            ),
            Place(
                id = 24,
                subjectResourceId = R.string.lucerasubject,
                descriptionResourceId = R.string.lucerabody,
                imageResourceId = R.drawable.lucerarestaurant,
                category = PlaceCategory.RESTAURANT
            ),
            Place(
                id = 25,
                subjectResourceId = R.string.mogansubject,
                descriptionResourceId = R.string.moganbody,
                imageResourceId = R.drawable.mogan,
                category = PlaceCategory.PARK
            ),
            Place(
                id = 26,
                subjectResourceId = R.string.nextlevelsubject,
                descriptionResourceId = R.string.nextlevelbody,
                imageResourceId = R.drawable.nextlevel,
                category = PlaceCategory.AVM
            ),
            Place(
                id = 27,
                subjectResourceId = R.string.nüktelisubject,
                descriptionResourceId = R.string.nüktelibody,
                imageResourceId = R.drawable.nuktelirestaurant,
                category = PlaceCategory.RESTAURANT
            ),
            Place(
                id = 28,
                subjectResourceId = R.string.tarabyasubject,
                descriptionResourceId = R.string.tarabyabody,
                imageResourceId = R.drawable.tarabyafishhouse,
                category = PlaceCategory.RESTAURANT
            ),
            Place(
                id = 29,
                subjectResourceId = R.string.taurussubject,
                descriptionResourceId = R.string.taurusbody,
                imageResourceId = R.drawable.taurus,
                category = PlaceCategory.AVM
            ),
            Place(
                id = 30,
                subjectResourceId = R.string.trilyesubject,
                descriptionResourceId = R.string.trilyebody,
                imageResourceId = R.drawable.trilyerestauant,
                category = PlaceCategory.RESTAURANT
            ),
            Place(
                id = 31,
                subjectResourceId = R.string.ugurmumcusubject,
                descriptionResourceId = R.string.ugurmumcubody,
                imageResourceId = R.drawable.ugurmumcu,
                category = PlaceCategory.PARK
            ),
        )
    fun get(id: Int): Place? {
        return allPlaces.firstOrNull { it.id == id }
    }
    val defaultPlace:Place = LocalPlacesDataProvider.allPlaces.get(1)
}