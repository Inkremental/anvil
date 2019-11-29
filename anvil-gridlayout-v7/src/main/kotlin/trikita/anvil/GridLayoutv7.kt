@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package trikita.anvil

import android.util.Printer
import android.view.View
import androidx.gridlayout.widget.GridLayout
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

fun gridLayout(configure: GridLayoutScope.() -> Unit = {}) =
    v<GridLayout>(configure.bind(GridLayoutScope))
abstract class GridLayoutScope : ViewGroupScope() {
  fun alignmentMode(arg: Int): Unit = attr("alignmentMode", arg)
  fun columnCount(arg: Int): Unit = attr("columnCount", arg)
  fun columnOrderPreserved(arg: Boolean): Unit = attr("columnOrderPreserved", arg)
  fun orientation(arg: Int): Unit = attr("orientation", arg)
  fun printer(arg: Printer): Unit = attr("printer", arg)
  fun rowCount(arg: Int): Unit = attr("rowCount", arg)
  fun rowOrderPreserved(arg: Boolean): Unit = attr("rowOrderPreserved", arg)
  fun useDefaultMargins(arg: Boolean): Unit = attr("useDefaultMargins", arg)
  companion object : GridLayoutScope() {
    init {
      Anvil.registerAttributeSetter(GridLayoutv7Setter)}
  }
}

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by
 * {@code gradle generateGridLayoutv7DSL}
 * It contains views and their setters from the library gridlayout-v7.
 * Please, don't edit it manually unless for debugging.
 */
object GridLayoutv7Setter : Anvil.AttributeSetter<Any?> {
  init {
    Anvil.registerAttributeSetter(this)
  }

  override fun set(
    v: View,
    name: String,
    arg: Any?,
    old: Any?
  ): Boolean = when (name) {
    "alignmentMode" -> when {
      v is GridLayout && arg is Int -> {
        v.setAlignmentMode(arg)
        true
      }
      else -> false
    }
    "columnCount" -> when {
      v is GridLayout && arg is Int -> {
        v.setColumnCount(arg)
        true
      }
      else -> false
    }
    "columnOrderPreserved" -> when {
      v is GridLayout && arg is Boolean -> {
        v.setColumnOrderPreserved(arg)
        true
      }
      else -> false
    }
    "orientation" -> when {
      v is GridLayout && arg is Int -> {
        v.setOrientation(arg)
        true
      }
      else -> false
    }
    "printer" -> when {
      v is GridLayout && arg is Printer -> {
        v.setPrinter(arg)
        true
      }
      else -> false
    }
    "rowCount" -> when {
      v is GridLayout && arg is Int -> {
        v.setRowCount(arg)
        true
      }
      else -> false
    }
    "rowOrderPreserved" -> when {
      v is GridLayout && arg is Boolean -> {
        v.setRowOrderPreserved(arg)
        true
      }
      else -> false
    }
    "useDefaultMargins" -> when {
      v is GridLayout && arg is Boolean -> {
        v.setUseDefaultMargins(arg)
        true
      }
      else -> false
    }
    else -> false
  }
}
