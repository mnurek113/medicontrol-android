package com.code.knab.medicontrol.dagger

import android.content.Context
import com.code.knab.medicontrol.utils.rx.RxUtils
import com.code.knab.medicontrol.utils.rx.RxUtilsImpl
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.Executors
import javax.inject.Singleton

/**gi
 * Created by Michał on 30.05.2018.
 */
@Module
class AppModule(context: Context) {

    @Provides
    @Singleton
    fun provideRxUtils(): RxUtils = RxUtilsImpl(AndroidSchedulers.mainThread(),
            Schedulers.from(Executors.newFixedThreadPool(4)))

}