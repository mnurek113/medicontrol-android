package com.code.knab.medicontrol.dagger

/**
 * Created by Michał on 30.05.2018.
 */
interface Injector<in T> {
    fun inject(target:T)
}