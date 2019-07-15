package com.andrzejryl.core.util

import android.content.Context
import androidx.annotation.PluralsRes
import androidx.annotation.StringRes

/**
 * Created by Andrzej Ryl on 2019-07-11.
 *
 * Copyright 2019 Andrzej Ryl. All rights reserved.
 */
interface ResourceProvider {

  fun getString(@StringRes stringResId: Int): String

  fun getString(@StringRes stringResId: Int, param: String): String

  fun getQuantityString(@PluralsRes pluralResId: Int, value: Int): String
}

class ResourceProviderImpl(private val context: Context) : ResourceProvider {

  override fun getString(stringResId: Int): String = context.getString(stringResId)

  override fun getString(stringResId: Int, param: String): String =
          context.getString(stringResId, param)

  override fun getQuantityString(pluralResId: Int, value: Int): String =
          context.resources.getQuantityString(pluralResId, value, value)
}