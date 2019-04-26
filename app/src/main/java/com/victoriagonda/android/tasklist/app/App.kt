package com.victoriagonda.android.tasklist.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.context.startKoin

class App : Application(){
  override fun onCreate() {
    super.onCreate()
    if (GlobalContext.getOrNull() == null) {
      startKoin {
        // use AndroidLogger as Koin Logger - default Level.INFO
        androidLogger()

        // use the Android context given there
        androidContext(this@App)

        // load properties from assets/koin.properties file
        androidFileProperties()

        // module list
        modules(appModule)
      }
    }
  }
}