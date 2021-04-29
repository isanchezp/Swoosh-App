package com.ivan.section5.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ivan.section5.utilities.Constants
import com.ivan.section5.R
import com.ivan.section5.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private val player = Player()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensCliked(view: View) {
        btn_womens.isChecked = false
        btn_co_ed.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        btn_mens.isChecked = false
        btn_co_ed.isChecked = false
        player.league = "womens"
    }

    fun wonCoEdClicked(view: View) {
        btn_mens.isChecked = false
        btn_womens.isChecked = false
        player.league = "co-ed"
    }

    fun onNextClicked(view: View){
        if (player.league.isNotEmpty()) {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(Constants.EXTRA_PLAYER, player)
            startActivity(intent)
        } else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }
    }
}