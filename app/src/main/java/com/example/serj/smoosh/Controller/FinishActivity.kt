package com.example.serj.smoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.serj.smoosh.R
import com.example.serj.smoosh.Utilities.EXTRA_LEAGUE
import com.example.serj.smoosh.Utilities.EXTRA_SKILS
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
         val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill=  intent.getStringExtra(EXTRA_SKILS)

        searchLeachText.text = "Looking  for $league $skill near you ..."
    }
}
