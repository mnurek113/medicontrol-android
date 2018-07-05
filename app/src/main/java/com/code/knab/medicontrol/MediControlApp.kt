package com.code.knab.medicontrol

import android.app.Application
import com.code.knab.medicontrol.dagger.AppModule
import com.code.knab.medicontrol.dagger.DaggerAppComponent

/**
 * Created by Michał on 30.05.2018.
 */
class MediControlApp: Application() {

    val component by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}