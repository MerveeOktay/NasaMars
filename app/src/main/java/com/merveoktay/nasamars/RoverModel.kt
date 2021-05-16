package com.merveoktay.nasamars

data class RoverModel (
    val id: Int,
    val name: String,
    val launchDate:String="1/12/12",
    val landingDate: String="2/12/12",
    val maxDate: String="3/12/12",
    val status: String="complete",
    val maxSol: Int=0,
    val totalPhotos: Int=0,
    val imageUrl: String="")