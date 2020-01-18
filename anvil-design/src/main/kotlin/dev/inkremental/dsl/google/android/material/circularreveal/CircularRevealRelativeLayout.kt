@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.google.android.material.circularreveal

import android.graphics.drawable.Drawable
import com.google.android.material.circularreveal.CircularRevealRelativeLayout
import com.google.android.material.circularreveal.CircularRevealWidget
import dev.inkremental.dsl.android.widget.RelativeLayoutScope
import dev.inkremental.dsl.google.android.material.CustomMaterialSetter
import dev.inkremental.dsl.google.android.material.MaterialSetter
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import trikita.anvil.Anvil
import trikita.anvil.attr
import trikita.anvil.bind
import trikita.anvil.v

fun circularRevealRelativeLayout(configure: CircularRevealRelativeLayoutScope.() -> Unit = {}) =
    v<CircularRevealRelativeLayout>(configure.bind(CircularRevealRelativeLayoutScope))
abstract class CircularRevealRelativeLayoutScope : RelativeLayoutScope() {
  fun circularRevealOverlayDrawable(arg: Drawable?): Unit = attr("circularRevealOverlayDrawable",
      arg)
  fun circularRevealScrimColor(arg: Int): Unit = attr("circularRevealScrimColor", arg)
  fun revealInfo(arg: CircularRevealWidget.RevealInfo?): Unit = attr("revealInfo", arg)
  companion object : CircularRevealRelativeLayoutScope() {
    init {
      Anvil.registerAttributeSetter(MaterialSetter)
      Anvil.registerAttributeSetter(CustomMaterialSetter)
    }
  }
}