package com.ivan.section5.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ivan.section5.utilities.Constants
import com.ivan.section5.R
import com.ivan.section5.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    private lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        intent?.let{
            player = intent.getSerializableExtra(Constants.EXTRA_PLAYER) as Player
        }
    }

    fun onBeginnerClicked(view: View) {
        btn_baller.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        btn_beginner.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (player.skill.isNotEmpty()) {
            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra(Constants.EXTRA_PLAYER, player)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_LONG).show()
        }
    }
}