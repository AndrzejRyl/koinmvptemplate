package com.andrzejryl.kointemplate.application.di

import androidx.room.Room
import com.andrzejryl.kointemplate.data.DatabaseTransactionProvider
import com.andrzejryl.kointemplate.data.RoomAppDatabase
import com.andrzejryl.kointemplate.data.RoomDatabaseTransactionProvider
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Created by Andrzej Ryl on 2019-07-11.
 *
 * Copyright 2019 Andrzej Ryl. All rights reserved.
 */
val databaseModule = module {
  single {
    Room.databaseBuilder(
            androidContext(),
            RoomAppDatabase::class.java,
            RoomAppDatabase.DB_NAME
    ).build()
  }

  // TODO: Add realm initialized object

  single<DatabaseTransactionProvider<RoomAppDatabase>> { RoomDatabaseTransactionProvider(get()) }

  // TODO: Add realm implementation
}