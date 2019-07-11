package com.andrzejryl.kointemplate.data

/**
 * Created by Andrzej Ryl on 2019-07-11.
 *
 * Copyright 2019 Andrzej Ryl. All rights reserved.
 */

interface DatabaseTransactionProvider<T> {
  fun runInTransaction(action: (T) -> Unit)
}

class RoomDatabaseTransactionProvider(private val database: RoomAppDatabase): DatabaseTransactionProvider<RoomAppDatabase> {

  override fun runInTransaction(action: (RoomAppDatabase) -> Unit) {
    database.run {
      runInTransaction {
        action(this)
      }
    }
  }
}

// TODO: Add realm implementation