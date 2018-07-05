package com.code.knab.medicontrol.utils.rx

import io.reactivex.Scheduler

/**
 * Created by Michał on 05.07.2018.
 */
interface RxUtils {
    val observScheduler: Scheduler
    val subscrbeScheduler: Scheduler
}