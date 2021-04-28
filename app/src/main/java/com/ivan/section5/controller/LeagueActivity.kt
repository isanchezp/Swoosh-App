package com.ivan.section5.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ivan.section5.utilities.Constants
import com.ivan.section5.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensCliked(view: View) {
        btn_womens.isChecked = false
        btn_co_ed.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        btn_mens.isChecked = false
        btn_co_ed.isChecked = false
        selectedLeague = "womens"
    }

    fun wonCoEdClicked(view: View) {
        btn_mens.isChecked = false
        btn_womens.isChecked = false
        selectedLeague = "co-ed"
    }

    fun onNextClicked(view: View){
        if (selectedLeague.isNotEmpty()) {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(Constants.EXTRA_LEAGUE, selectedLeague)
            startActivity(intent)
        } else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }
    }
}