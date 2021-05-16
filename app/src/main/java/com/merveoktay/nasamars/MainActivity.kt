package com.merveoktay.nasamars

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.merveoktay.nasamars.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val curiosity= RoverModel(
        1,
        "Curiosity",
        "4/4/2004",
        "5/5/2005",
        "12/12/2012",
        "complete",
        100,
        100,
        "https://www.sciencemag.org/sites/default/files/styles/article_main_large/public/sn-curiosity.jpg?itok=ok6vgedp")

    val spirit= RoverModel(
        2,
        "Spirit",
        "4/4/2004",
        "5/5/2005",
        "12/12/2012",
        "complete",
        100,
        100,
        "https://cdn.mos.cms.futurecdn.net/EYoiusNmH87rrMTCMaBZbH.jpg")

    val opportunity= RoverModel(
        3,
        "Opportunity",
        "4/4/2004",
        "5/5/2005",
        "12/12/2012",
        "complete",
        100,
        100,
        "https://www.webtekno.com/images/editor/default/0001/88/9a02b91d7e686596a3ca4fe026c272c5dd9b8694.jpeg")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.roverCuriosityModel= curiosity
        binding.roverOpportunityModel=opportunity
        binding.roverSpiritModel=spirit
        val displayMetrics= DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        //var width= displayMetrics.widthPixels

        binding.screenWidth=displayMetrics.widthPixels

    }

}

