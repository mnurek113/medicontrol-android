package com.code.knab.medicontrol.ui.drip_sense.dagger

import com.code.knab.medicontrol.MediControlApp
import com.code.knab.medicontrol.dagger.Injector
import com.code.knab.medicontrol.ui.drip_sense.DripSenseActivity

/**
 * Created by Michał on 05.07.2018.
 */
class DripSenseInjector: Injector<DripSenseActivity>{
    override fun inject(target: DripSenseActivity) {
        (target.applicationContext as MediControlApp).component.plus(DripSenseModule(target)).inject(target)
    }
}