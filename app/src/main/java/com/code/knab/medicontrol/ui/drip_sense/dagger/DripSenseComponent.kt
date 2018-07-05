package com.code.knab.medicontrol.ui.drip_sense.dagger

import com.code.knab.medicontrol.ui.drip_sense.DripSenseActivity
import dagger.Subcomponent

/**
 * Created by Michał on 05.07.2018.
 */
@DripSenseScope
@Subcomponent(modules = arrayOf(DripSenseModule::class))
interface DripSenseComponent {
    fun inject(activity: DripSenseActivity)
}