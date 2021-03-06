@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.androidx.viewpager2

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import dev.inkremental.Inkremental
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by
 * {@code gradle Viewpager2Setter}
 * It contains views and their setters for the library viewpager2-1.0.0.
 * Please, don't edit it manually unless for debugging.
 */
object Viewpager2Setter : Inkremental.AttributeSetter<Any> {
  override fun set(
    v: View,
    name: String,
    arg: Any?,
    old: Any?
  ): Boolean = when (name) {
    "currentItem" -> when {
      v is ViewPager2 && arg is Int -> {
        v.setCurrentItem(arg)
        true
      }
      else -> false
    }
    "offscreenPageLimit" -> when {
      v is ViewPager2 && arg is Int -> {
        v.setOffscreenPageLimit(arg)
        true
      }
      else -> false
    }
    "orientation" -> when {
      v is ViewPager2 && arg is Int -> {
        v.setOrientation(arg)
        true
      }
      else -> false
    }
    "pageTransformer" -> when {
      v is ViewPager2 && arg is ViewPager2.PageTransformer? -> {
        v.setPageTransformer(arg)
        true
      }
      else -> false
    }
    "userInputEnabled" -> when {
      v is ViewPager2 && arg is Boolean -> {
        v.setUserInputEnabled(arg)
        true
      }
      else -> false
    }
    else -> false
  }
}
