package com.andrzejryl.kointemplate.application.di

import io.reactivex.disposables.CompositeDisposable
import org.koin.dsl.module

/**
 * Created by Andrzej Ryl on 2019-07-11.
 *
 * Copyright 2019 Andrzej Ryl. All rights reserved.
 */
val applicationModule = module {
  factory { CompositeDisposable() }
}

val koinMvpTemplateModules = listOf(
        applicationModule,
        databaseModule
)