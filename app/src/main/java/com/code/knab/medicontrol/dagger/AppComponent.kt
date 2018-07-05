package com.code.knab.medicontrol.dagger

import com.code.knab.medicontrol.ui.drip_sense.dagger.DripSenseComponent
import com.code.knab.medicontrol.ui.drip_sense.dagger.DripSenseModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Michał on 30.05.2018.
 */
@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {

    fun plus(dripSenseModule: DripSenseModule): DripSenseComponent

}