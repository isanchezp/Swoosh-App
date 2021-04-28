package com.ivan.section5.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ivan.section5.utilities.Constants
import com.ivan.section5.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    private var league = ""
    private var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        intent?.let{
            league = intent.getStringExtra(Constants.EXTRA_LEAGUE)!!
        }
    }

    fun onBeginnerClicked(view: View) {
        btn_baller.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        btn_beginner.isChecked = false
        skill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (skill.isNotEmpty()) {
            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra(Constants.EXTRA_LEAGUE, league)
            intent.putExtra(Constants.EXTRA_SKILL, skill)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_LONG).show()
        }
    }
}