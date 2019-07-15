package com.andrzejryl.kointemplate.application.di

import com.andrzejryl.core.util.ResourceProvider
import com.andrzejryl.core.util.ResourceProviderImpl
import com.andrzejryl.kointemplate.BuildConfig
import com.andrzejryl.kointemplate.R
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Created by Andrzej Ryl on 2019-07-11.
 *
 * Copyright 2019 Andrzej Ryl. All rights reserved.
 */
// TODO: Resource provider, remote config, timber

val servicesModule = module {

  single<ResourceProvider> { ResourceProviderImpl(androidContext()) }

  // TODO: Initialize remote config the new way
  single {
    FirebaseRemoteConfigSettings.Builder()
      .setDeveloperModeEnabled(BuildConfig.DEBUG)
      .build()
  }

  single {
    FirebaseRemoteConfig
      .getInstance()
      .apply {
        setConfigSettings(get())
        setDefaults(R.xml.remote_config_defaults)
      }
  }

  single<RemoteConfigProvider> { RemoteConfigProviderImpl(get()) }
}