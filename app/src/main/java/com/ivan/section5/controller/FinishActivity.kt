package com.ivan.section5.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivan.section5.R
import com.ivan.section5.model.Player
import com.ivan.section5.utilities.Constants
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    private lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        intent?.let {
            player = intent.getSerializableExtra(Constants.EXTRA_PLAYER) as Player
            tv_msg.text = "Looking for ${player.league} ${player.skill} league near you..."
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