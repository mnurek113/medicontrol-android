package com.code.knab.medicontrol.ui.drip_sense

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.code.knab.medicontrol.R
import com.code.knab.medicontrol.ui.drip_sense.mvp.DripSenseMVP

class DripSenseActivity : AppCompatActivity(), DripSenseMVP.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drip_sense)
    }
}
