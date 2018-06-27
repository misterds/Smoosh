package com.example.serj.smoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.serj.smoosh.R
import com.example.serj.smoosh.Utilities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*


//we inheriten the class BaseActivity()

class LeagueActivity : BaseActivity(){
     var selectedLeagu = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


//manes Buttons
    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        codeLeagueBtn.isChecked = false
        selectedLeagu = "mens"

}

    fun onWomensClicled(view: View){
        mensLeagueBtn.isChecked =  false
        codeLeagueBtn.isChecked =  false

        selectedLeagu = "womens"


    }


    fun onCoEdClicked(view: View){
        mensLeagueBtn.isChecked =  false
        womensLeagueBtn.isChecked = false

        selectedLeagu = "co-ed"


    }

    fun leagueNextClicked(view:View){
            if(selectedLeagu !== "") {
//         create an Intent SkillsActivity
                val skilActivity = Intent(this, SkillsActivity::class.java)

//                Creating  and  and  put EXTRA  and inporting  from COnastnt  Class "XTRA_LEAGUE,"   this is  sending  a variable or data  to on the  Intent
                skilActivity.putExtra(EXTRA_LEAGUE,selectedLeagu)
                startActivity(skilActivity)

            }
        else{
//                creating Toast this  is   an message on the  screen
                Toast.makeText(this, "PLeas select a league" ,Toast.LENGTH_SHORT).show()
            }
    }



}
