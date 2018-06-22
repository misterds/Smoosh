package com.example.serj.smoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


//we inheriten the class BaseActivity()

class LeagueActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
}
