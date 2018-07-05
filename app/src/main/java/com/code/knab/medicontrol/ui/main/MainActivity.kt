package com.code.knab.medicontrol.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.code.knab.medicontrol.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dripSenseButton.setOnClickListener {

        }
    }
}
