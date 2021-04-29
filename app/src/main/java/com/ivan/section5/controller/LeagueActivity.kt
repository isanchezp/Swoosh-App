package com.ivan.section5.controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.ivan.section5.utilities.Constants
import com.ivan.section5.R
import com.ivan.section5.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private var player = Player()

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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putSerializable(Constants.EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getSerializable(Constants.EXTRA_PLAYER) as Player
    }
}