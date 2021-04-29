package com.ivan.section5.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivan.section5.R
import com.ivan.section5.model.Player
import com.ivan.section5.utilities.Constants
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        intent?.let {
            val player = intent.getSerializableExtra(Constants.EXTRA_PLAYER) as Player
            tv_msg.text = "Looking for ${player.league} ${player.skill} league near you..."
        }
    }
}