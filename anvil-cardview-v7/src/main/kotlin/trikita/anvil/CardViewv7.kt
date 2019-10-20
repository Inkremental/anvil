@file:Suppress("DEPRECATION", "UNCHECKED_CAST")

package trikita.anvil

import android.content.res.ColorStateList
import android.view.View
import androidx.cardview.widget.CardView
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

fun cardView(configure: CardViewScope.() -> Unit = {}) = v<CardView>(configure.bind(CardViewScope))
abstract class CardViewScope : FrameLayoutScope() {
  fun cardBackgroundColor(arg: ColorStateList?): Unit = attr("cardBackgroundColor", arg)
  fun cardBackgroundColor(arg: Int): Unit = attr("cardBackgroundColor", arg)
  fun cardElevation(arg: Float): Unit = attr("cardElevation", arg)
  fun maxCardElevation(arg: Float): Unit = attr("maxCardElevation", arg)
  fun preventCornerOverlap(arg: Boolean): Unit = attr("preventCornerOverlap", arg)
  fun radius(arg: Float): Unit = attr("radius", arg)
  fun useCompatPadding(arg: Boolean): Unit = attr("useCompatPadding", arg)
  companion object : CardViewScope() {
    init {
      Anvil.registerAttributeSetter(CardViewv7Setter)}
  }
}

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by
 * {@code gradle generateCardViewv7DSL}
 * It contains views and their setters from the library cardview-v7.
 * Please, don't edit it manually unless for debugging.
 */
object CardViewv7Setter : Anvil.AttributeSetter<Any?> {
  init {
    Anvil.registerAttributeSetter(this)
  }

  override fun set(
    v: View,
    name: String,
    arg: Any?,
    old: Any?
  ): Boolean = when (name) {
    "cardBackgroundColor" -> when {
      v is CardView && (arg == null || arg is ColorStateList) -> {
        v.setCardBackgroundColor(arg as ColorStateList)
        true
      }
      v is CardView && arg is Int -> {
        v.setCardBackgroundColor(arg)
        true
      }
      else -> false
    }
    "cardElevation" -> when {
      v is CardView && arg is Float -> {
        v.setCardElevation(arg)
        true
      }
      else -> false
    }
    "maxCardElevation" -> when {
      v is CardView && arg is Float -> {
        v.setMaxCardElevation(arg)
        true
      }
      else -> false
    }
    "preventCornerOverlap" -> when {
      v is CardView && arg is Boolean -> {
        v.setPreventCornerOverlap(arg)
        true
      }
      else -> false
    }
    "radius" -> when {
      v is CardView && arg is Float -> {
        v.setRadius(arg)
        true
      }
      else -> false
    }
    "useCompatPadding" -> when {
      v is CardView && arg is Boolean -> {
        v.setUseCompatPadding(arg)
        true
      }
      else -> false
    }
    else -> false
  }
}