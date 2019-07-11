package com.andrzejryl.kointemplate.application

import android.app.Application
import com.andrzejryl.kointemplate.application.di.koinMvpTemplateModules
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Andrzej Ryl on 2019-07-11.
 *
 * Copyright 2019 Andrzej Ryl. All rights reserved.
 */
class KoinMvpTemplateApplication : Application() {

  override fun onCreate() {
    super.onCreate()
    startKoin {
      logger(KoinLogger())
      androidContext(this@KoinMvpTemplateApplication)
      modules(koinMvpTemplateModules)
    }
    initCrashlytics()
  }

  private fun initCrashlytics() {
    Fabric.with(this, Crashlytics())
  }
}