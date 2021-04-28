package com.ivan.section5.controller

import android.content.Intent
import android.os.Bundle
import com.ivan.section5.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btn_get_started.setOnClickListener {
            val intent = Intent(this, LeagueActivity::class.java)
            startActivity(intent)
        }
    }
}