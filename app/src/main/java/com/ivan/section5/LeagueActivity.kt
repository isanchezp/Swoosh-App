package com.ivan.section5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onNextClicked(view: View){
        val intent = Intent(this, SkillActivity::class.java)
        startActivity(intent)
    }
}