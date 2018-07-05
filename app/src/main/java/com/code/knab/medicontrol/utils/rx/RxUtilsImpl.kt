package com.code.knab.medicontrol.utils.rx

import io.reactivex.Scheduler

/**
 * Created by Michał on 05.07.2018.
 */
class RxUtilsImpl(override val observScheduler: Scheduler,
                  override val subscrbeScheduler: Scheduler) : RxUtils {
}