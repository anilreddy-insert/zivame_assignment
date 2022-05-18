package com.bitm.zivame.koin

import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level
import org.koin.core.module.Module

fun getAppKoinLayer(app: ZivameApplication) = startKoin {
    androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
    androidContext(app)
    modules(moduleList)
}

val moduleList = listOf<Module>(
    appModules
)
