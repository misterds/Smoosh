package com.example.serj.smoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.serj.smoosh.R
import kotlinx.android.synthetic.main.activity_welcom.*

class WelcomActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)

//        add click event

        getStartedButton.setOnClickListener {
//            creating   explisite Intent
            val leagueIntent = Intent(this, LeagueActivity::class.java)
//            start  explisite Intent   with startActivity method
            startActivity(leagueIntent)
        }
    }
}
