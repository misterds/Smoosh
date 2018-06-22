package com.example.serj.smoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcom.*

class WelcomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)

//        add click event

        getStartedButton.setOnClickListener {
//            creating   explisite Intent
            val leagueIntent = Intent(this,LeagueActivity::class.java)
//            start  explisite Intent   with startActivity method
            startActivity(leagueIntent)
        }
    }
}
