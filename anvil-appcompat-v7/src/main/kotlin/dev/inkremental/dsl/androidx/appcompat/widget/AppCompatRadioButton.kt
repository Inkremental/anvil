@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.androidx.appcompat.widget

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import androidx.appcompat.widget.AppCompatRadioButton
import dev.inkremental.dsl.android.widget.RadioButtonScope
import dev.inkremental.dsl.androidx.appcompat.AppCompatv7Setter
import dev.inkremental.dsl.androidx.appcompat.CustomAppCompatv7Setter
import kotlin.Suppress
import kotlin.Unit
import trikita.anvil.Anvil
import trikita.anvil.attr
import trikita.anvil.bind
import trikita.anvil.v

fun appCompatRadioButton(configure: AppCompatRadioButtonScope.() -> Unit = {}) =
    v<AppCompatRadioButton>(configure.bind(AppCompatRadioButtonScope))
abstract class AppCompatRadioButtonScope : RadioButtonScope() {
  fun supportBackgroundTintList(arg: ColorStateList?): Unit = attr("supportBackgroundTintList", arg)
  fun supportBackgroundTintMode(arg: PorterDuff.Mode?): Unit = attr("supportBackgroundTintMode",
      arg)
  fun supportButtonTintList(arg: ColorStateList?): Unit = attr("supportButtonTintList", arg)
  fun supportButtonTintMode(arg: PorterDuff.Mode?): Unit = attr("supportButtonTintMode", arg)
  companion object : AppCompatRadioButtonScope() {
    init {
      Anvil.registerAttributeSetter(AppCompatv7Setter)
      Anvil.registerAttributeSetter(CustomAppCompatv7Setter)
    }
  }
}