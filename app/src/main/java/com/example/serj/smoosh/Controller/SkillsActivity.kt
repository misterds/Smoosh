package com.example.serj.smoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.serj.smoosh.R
import com.example.serj.smoosh.Utilities.EXTRA_LEAGUE
import com.example.serj.smoosh.Utilities.EXTRA_SKILS
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {


     var league = ""
    var skills = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        league = intent.getStringExtra(EXTRA_LEAGUE)

    }



    fun onBeginerClick(view: View){
        ballerSkilsBtn.isChecked = false
        skills = "beginer"
    }

    fun onBallerClick(view: View){
        beginerSkilsBtn.isChecked =  false
        skills = "baller"
    }

    fun onSckilsBtn(view: View){
        if(skills != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILS,skills)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this,"Please select a skiil level ",Toast.LENGTH_SHORT).show()
        }

    }
}
