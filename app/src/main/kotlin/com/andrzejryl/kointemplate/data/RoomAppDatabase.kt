package com.andrzejryl.kointemplate.data

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Andrzej Ryl on 2019-07-11.
 *
 * Copyright 2019 Andrzej Ryl. All rights reserved.
 */
@Database(
        entities = [],
        version = RoomAppDatabase.DB_VERSION
)
abstract class RoomAppDatabase : RoomDatabase() {

  companion object {
    const val DB_NAME = "koinmvptemplate.db"
    const val DB_VERSION = 1
  }
}