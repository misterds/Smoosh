package com.example.serj.smoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillsActivity : BaseActivity() {


     var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        print(league)
    }
}
