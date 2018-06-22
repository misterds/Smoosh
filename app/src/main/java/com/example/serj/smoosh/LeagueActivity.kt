package com.example.serj.smoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


//we inheriten the class BaseActivity()

class LeagueActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view:View){

//         create an Intent SkillsActivity
        val skilActivity = Intent(this, SkillsActivity::class.java)
        startActivity(skilActivity)
    }
}
