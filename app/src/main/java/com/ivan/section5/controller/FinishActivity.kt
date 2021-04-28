package com.ivan.section5.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivan.section5.R
import com.ivan.section5.utilities.Constants
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        intent?.let {
            val league = intent.getStringExtra(Constants.EXTRA_LEAGUE)
            val skill = intent.getStringExtra(Constants.EXTRA_SKILL)
            tv_msg.text = "Looking for $league $skill league near you..."
        }
    }
}