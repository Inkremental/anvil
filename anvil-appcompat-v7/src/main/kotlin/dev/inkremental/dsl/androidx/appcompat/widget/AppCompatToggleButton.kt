@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.androidx.appcompat.widget

import androidx.appcompat.widget.AppCompatToggleButton
import dev.inkremental.dsl.android.widget.ToggleButtonScope
import dev.inkremental.dsl.androidx.appcompat.AppCompatv7Setter
import dev.inkremental.dsl.androidx.appcompat.CustomAppCompatv7Setter
import kotlin.Suppress
import kotlin.Unit
import trikita.anvil.Anvil
import trikita.anvil.bind
import trikita.anvil.v

fun appCompatToggleButton(configure: AppCompatToggleButtonScope.() -> Unit = {}) =
    v<AppCompatToggleButton>(configure.bind(AppCompatToggleButtonScope))
abstract class AppCompatToggleButtonScope : ToggleButtonScope() {
  companion object : AppCompatToggleButtonScope() {
    init {
      Anvil.registerAttributeSetter(AppCompatv7Setter)
      Anvil.registerAttributeSetter(CustomAppCompatv7Setter)
    }
  }
}