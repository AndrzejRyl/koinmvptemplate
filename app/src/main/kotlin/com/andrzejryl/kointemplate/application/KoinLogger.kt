package com.andrzejryl.kointemplate.application

import android.util.Log
import com.andrzejryl.kointemplate.BuildConfig
import org.koin.core.logger.Level
import org.koin.core.logger.Logger
import org.koin.core.logger.MESSAGE

/**
 * Created by MiQUiDO on 26/03/2019.
 *
 * Copyright 2019 MiQUiDO <http://www.miquido.com/>. All rights reserved.
 */
class KoinLogger : Logger() {
  companion object {
    private const val TAG = "KOIN"
  }

  override fun log(level: Level, msg: MESSAGE) {
    if (BuildConfig.DEBUG) {
      when (level) {
        Level.DEBUG -> Log.d(TAG, msg)
        Level.INFO -> Log.i(TAG, msg)
        Level.ERROR -> Log.e(TAG, "[ERROR] - $msg")
      }
    }
  }
}