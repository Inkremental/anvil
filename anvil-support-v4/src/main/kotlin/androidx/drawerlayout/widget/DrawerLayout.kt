@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package androidx.drawerlayout.widget

import android.graphics.drawable.Drawable
import dev.inkremental.dsl.android.view.ViewGroupScope
import dev.inkremental.dsl.androidx.core.SupportCoreUiSetter
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import trikita.anvil.Anvil
import trikita.anvil.attr
import trikita.anvil.bind
import trikita.anvil.v

fun drawerLayout(configure: DrawerLayoutScope.() -> Unit = {}) =
    v<DrawerLayout>(configure.bind(DrawerLayoutScope))
abstract class DrawerLayoutScope : ViewGroupScope() {
  fun drawerElevation(arg: Float): Unit = attr("drawerElevation", arg)
  fun drawerLockMode(arg: Int): Unit = attr("drawerLockMode", arg)
  fun scrimColor(arg: Int): Unit = attr("scrimColor", arg)
  fun statusBarBackground(arg: Drawable?): Unit = attr("statusBarBackground", arg)
  fun statusBarBackground(arg: Int): Unit = attr("statusBarBackground", arg)
  fun statusBarBackgroundColor(arg: Int): Unit = attr("statusBarBackgroundColor", arg)
  companion object : DrawerLayoutScope() {
    init {
      Anvil.registerAttributeSetter(SupportCoreUiSetter)
    }
  }
}