@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.androidx.appcompat

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.graphics.Rect
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.widget.PopupWindow
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.ListMenuItemView
import androidx.appcompat.view.menu.MenuBuilder
import androidx.appcompat.widget.ActionBarContainer
import androidx.appcompat.widget.ActionBarOverlayLayout
import androidx.appcompat.widget.ActionMenuView
import androidx.appcompat.widget.ActivityChooserView
import androidx.appcompat.widget.AppCompatAutoCompleteTextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.appcompat.widget.AppCompatSpinner
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.ButtonBarLayout
import androidx.appcompat.widget.FitWindowsFrameLayout
import androidx.appcompat.widget.FitWindowsLinearLayout
import androidx.appcompat.widget.FitWindowsViewGroup
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.ScrollingTabContainerView
import androidx.appcompat.widget.SwitchCompat
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.widget.ViewStubCompat
import androidx.core.text.PrecomputedTextCompat
import androidx.core.view.ActionProvider
import dev.inkremental.Inkremental
import kotlin.Any
import kotlin.Boolean
import kotlin.CharSequence
import kotlin.Float
import kotlin.Function
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by
 * {@code gradle AppcompatV7Setter}
 * It contains views and their setters for the library appcompat-v7-1.1.0.
 * Please, don't edit it manually unless for debugging.
 */
object AppcompatV7Setter : Inkremental.AttributeSetter<Any> {
  override fun set(
    v: View,
    name: String,
    arg: Any?,
    old: Any?
  ): Boolean = when (name) {
    "checkable" -> when {
      v is ActionMenuItemView && arg is Boolean -> {
        v.setCheckable(arg)
        true
      }
      v is ListMenuItemView && arg is Boolean -> {
        v.setCheckable(arg)
        true
      }
      else -> false
    }
    "checked" -> when {
      v is ActionMenuItemView && arg is Boolean -> {
        v.setChecked(arg)
        true
      }
      v is ListMenuItemView && arg is Boolean -> {
        v.setChecked(arg)
        true
      }
      else -> false
    }
    "expandedFormat" -> when {
      v is ActionMenuItemView && arg is Boolean -> {
        v.setExpandedFormat(arg)
        true
      }
      else -> false
    }
    "icon" -> when {
      v is ActionMenuItemView && arg is Drawable -> {
        v.setIcon(arg)
        true
      }
      v is ListMenuItemView && arg is Drawable -> {
        v.setIcon(arg)
        true
      }
      v is ActionBarOverlayLayout && arg is Drawable -> {
        v.setIcon(arg)
        true
      }
      v is ActionBarOverlayLayout && arg is Int -> {
        v.setIcon(arg)
        true
      }
      else -> false
    }
    "itemInvoker" -> when {
      v is ActionMenuItemView && arg is MenuBuilder.ItemInvoker -> {
        v.setItemInvoker(arg)
        true
      }
      else -> false
    }
    "popupCallback" -> when {
      v is ActionMenuItemView && arg is ActionMenuItemView.PopupCallback -> {
        v.setPopupCallback(arg)
        true
      }
      else -> false
    }
    "title" -> when {
      v is ActionMenuItemView && arg is CharSequence -> {
        v.setTitle(arg)
        true
      }
      v is ListMenuItemView && arg is CharSequence -> {
        v.setTitle(arg)
        true
      }
      v is Toolbar && arg is CharSequence -> {
        v.setTitle(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setTitle(arg)
        true
      }
      else -> false
    }
    "forceShowIcon" -> when {
      v is ListMenuItemView && arg is Boolean -> {
        v.setForceShowIcon(arg)
        true
      }
      else -> false
    }
    "groupDividerEnabled" -> when {
      v is ListMenuItemView && arg is Boolean -> {
        v.setGroupDividerEnabled(arg)
        true
      }
      else -> false
    }
    "primaryBackground" -> when {
      v is ActionBarContainer && arg is Drawable -> {
        v.setPrimaryBackground(arg)
        true
      }
      else -> false
    }
    "splitBackground" -> when {
      v is ActionBarContainer && arg is Drawable -> {
        v.setSplitBackground(arg)
        true
      }
      else -> false
    }
    "stackedBackground" -> when {
      v is ActionBarContainer && arg is Drawable -> {
        v.setStackedBackground(arg)
        true
      }
      else -> false
    }
    "tabContainer" -> when {
      v is ActionBarContainer && arg is ScrollingTabContainerView -> {
        v.setTabContainer(arg)
        true
      }
      else -> false
    }
    "transitioning" -> when {
      v is ActionBarContainer && arg is Boolean -> {
        v.setTransitioning(arg)
        true
      }
      else -> false
    }
    "actionBarHideOffset" -> when {
      v is ActionBarOverlayLayout && arg is Int -> {
        v.setActionBarHideOffset(arg)
        true
      }
      else -> false
    }
    "actionBarVisibilityCallback" -> when {
      v is ActionBarOverlayLayout && arg is ActionBarOverlayLayout.ActionBarVisibilityCallback -> {
        v.setActionBarVisibilityCallback(arg)
        true
      }
      else -> false
    }
    "hasNonEmbeddedTabs" -> when {
      v is ActionBarOverlayLayout && arg is Boolean -> {
        v.setHasNonEmbeddedTabs(arg)
        true
      }
      else -> false
    }
    "hideOnContentScrollEnabled" -> when {
      v is ActionBarOverlayLayout && arg is Boolean -> {
        v.setHideOnContentScrollEnabled(arg)
        true
      }
      else -> false
    }
    "logo" -> when {
      v is Toolbar && arg is Drawable -> {
        v.setLogo(arg)
        true
      }
      v is ActionBarOverlayLayout && arg is Int -> {
        v.setLogo(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setLogo(arg)
        true
      }
      else -> false
    }
    "overlayMode" -> when {
      v is ActionBarOverlayLayout && arg is Boolean -> {
        v.setOverlayMode(arg)
        true
      }
      else -> false
    }
    "showingForActionMode" -> when {
      v is ActionBarOverlayLayout && arg is Boolean -> {
        v.setShowingForActionMode(arg)
        true
      }
      else -> false
    }
    "uiOptions" -> when {
      v is ActionBarOverlayLayout && arg is Int -> {
        v.setUiOptions(arg)
        true
      }
      else -> false
    }
    "windowCallback" -> when {
      v is ActionBarOverlayLayout && arg is Window.Callback -> {
        v.setWindowCallback(arg)
        true
      }
      else -> false
    }
    "windowTitle" -> when {
      v is ActionBarOverlayLayout && arg is CharSequence -> {
        v.setWindowTitle(arg)
        true
      }
      else -> false
    }
    "expandedActionViewsExclusive" -> when {
      v is ActionMenuView && arg is Boolean -> {
        v.setExpandedActionViewsExclusive(arg)
        true
      }
      else -> false
    }
    "onMenuItemClick" -> when {
      v is ActionMenuView -> when {
        arg == null -> {
          v.setOnMenuItemClickListener(null as? ActionMenuView.OnMenuItemClickListener?)
          true
        }
        arg is Function<*> -> {
          arg as ((arg0: MenuItem) -> Boolean)?
          v.setOnMenuItemClickListener { arg0 ->
            arg(arg0).also { Inkremental.render() }
          }
          true
        }
        else -> false
      }
      v is Toolbar -> when {
        arg == null -> {
          v.setOnMenuItemClickListener(null as? Toolbar.OnMenuItemClickListener?)
          true
        }
        arg is Function<*> -> {
          arg as ((arg0: MenuItem) -> Boolean)?
          v.setOnMenuItemClickListener { arg0 ->
            arg(arg0).also { Inkremental.render() }
          }
          true
        }
        else -> false
      }
      else -> false
    }
    "overflowIcon" -> when {
      v is ActionMenuView && arg is Drawable? -> {
        v.setOverflowIcon(arg)
        true
      }
      v is Toolbar && arg is Drawable? -> {
        v.setOverflowIcon(arg)
        true
      }
      else -> false
    }
    "overflowReserved" -> when {
      v is ActionMenuView && arg is Boolean -> {
        v.setOverflowReserved(arg)
        true
      }
      else -> false
    }
    "popupTheme" -> when {
      v is ActionMenuView && arg is Int -> {
        v.setPopupTheme(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setPopupTheme(arg)
        true
      }
      else -> false
    }
    "defaultActionButtonContentDescription" -> when {
      v is ActivityChooserView && arg is Int -> {
        v.setDefaultActionButtonContentDescription(arg)
        true
      }
      else -> false
    }
    "expandActivityOverflowButtonContentDescription" -> when {
      v is ActivityChooserView && arg is Int -> {
        v.setExpandActivityOverflowButtonContentDescription(arg)
        true
      }
      else -> false
    }
    "expandActivityOverflowButtonDrawable" -> when {
      v is ActivityChooserView && arg is Drawable -> {
        v.setExpandActivityOverflowButtonDrawable(arg)
        true
      }
      else -> false
    }
    "initialActivityCount" -> when {
      v is ActivityChooserView && arg is Int -> {
        v.setInitialActivityCount(arg)
        true
      }
      else -> false
    }
    "onDismiss" -> when {
      v is ActivityChooserView -> when {
        arg == null -> {
          v.setOnDismissListener(null as? PopupWindow.OnDismissListener?)
          true
        }
        arg is Function<*> -> {
          arg as (() -> Unit)?
          v.setOnDismissListener {  ->
            arg().also { Inkremental.render() }
          }
          true
        }
        else -> false
      }
      else -> false
    }
    "provider" -> when {
      v is ActivityChooserView && arg is ActionProvider -> {
        v.setProvider(arg)
        true
      }
      else -> false
    }
    "supportBackgroundTintList" -> when {
      v is AppCompatAutoCompleteTextView && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatButton && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatCheckBox && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatEditText && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatImageButton && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatImageView && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatMultiAutoCompleteTextView && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatRadioButton && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatSpinner && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      v is AppCompatTextView && arg is ColorStateList? -> {
        v.setSupportBackgroundTintList(arg)
        true
      }
      else -> false
    }
    "supportBackgroundTintMode" -> when {
      v is AppCompatAutoCompleteTextView && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatButton && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatCheckBox && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatEditText && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatImageButton && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatImageView && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatMultiAutoCompleteTextView && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatRadioButton && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatSpinner && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      v is AppCompatTextView && arg is PorterDuff.Mode? -> {
        v.setSupportBackgroundTintMode(arg)
        true
      }
      else -> false
    }
    "supportAllCaps" -> when {
      v is AppCompatButton && arg is Boolean -> {
        v.setSupportAllCaps(arg)
        true
      }
      else -> false
    }
    "supportButtonTintList" -> when {
      v is AppCompatCheckBox && arg is ColorStateList? -> {
        v.setSupportButtonTintList(arg)
        true
      }
      v is AppCompatRadioButton && arg is ColorStateList? -> {
        v.setSupportButtonTintList(arg)
        true
      }
      else -> false
    }
    "supportButtonTintMode" -> when {
      v is AppCompatCheckBox && arg is PorterDuff.Mode? -> {
        v.setSupportButtonTintMode(arg)
        true
      }
      v is AppCompatRadioButton && arg is PorterDuff.Mode? -> {
        v.setSupportButtonTintMode(arg)
        true
      }
      else -> false
    }
    "supportImageTintList" -> when {
      v is AppCompatImageButton && arg is ColorStateList? -> {
        v.setSupportImageTintList(arg)
        true
      }
      v is AppCompatImageView && arg is ColorStateList? -> {
        v.setSupportImageTintList(arg)
        true
      }
      else -> false
    }
    "supportImageTintMode" -> when {
      v is AppCompatImageButton && arg is PorterDuff.Mode? -> {
        v.setSupportImageTintMode(arg)
        true
      }
      v is AppCompatImageView && arg is PorterDuff.Mode? -> {
        v.setSupportImageTintMode(arg)
        true
      }
      else -> false
    }
    "precomputedText" -> when {
      v is AppCompatTextView && arg is PrecomputedTextCompat -> {
        v.setPrecomputedText(arg)
        true
      }
      else -> false
    }
    "supportCompoundDrawablesTintList" -> when {
      v is AppCompatTextView && arg is ColorStateList? -> {
        v.setSupportCompoundDrawablesTintList(arg)
        true
      }
      else -> false
    }
    "supportCompoundDrawablesTintMode" -> when {
      v is AppCompatTextView && arg is PorterDuff.Mode? -> {
        v.setSupportCompoundDrawablesTintMode(arg)
        true
      }
      else -> false
    }
    "textMetricsParamsCompat" -> when {
      v is AppCompatTextView && arg is PrecomputedTextCompat.Params -> {
        v.setTextMetricsParamsCompat(arg)
        true
      }
      else -> false
    }
    "allowStacking" -> when {
      v is ButtonBarLayout && arg is Boolean -> {
        v.setAllowStacking(arg)
        true
      }
      else -> false
    }
    "onFitSystemWindows" -> when {
      v is FitWindowsFrameLayout -> when {
        arg == null -> {
          v.setOnFitSystemWindowsListener(null as? FitWindowsViewGroup.OnFitSystemWindowsListener?)
          true
        }
        arg is Function<*> -> {
          arg as ((arg0: Rect) -> Unit)?
          v.setOnFitSystemWindowsListener { arg0 ->
            arg(arg0).also { Inkremental.render() }
          }
          true
        }
        else -> false
      }
      v is FitWindowsLinearLayout -> when {
        arg == null -> {
          v.setOnFitSystemWindowsListener(null as? FitWindowsViewGroup.OnFitSystemWindowsListener?)
          true
        }
        arg is Function<*> -> {
          arg as ((arg0: Rect) -> Unit)?
          v.setOnFitSystemWindowsListener { arg0 ->
            arg(arg0).also { Inkremental.render() }
          }
          true
        }
        else -> false
      }
      else -> false
    }
    "baselineAligned" -> when {
      v is LinearLayoutCompat && arg is Boolean -> {
        v.setBaselineAligned(arg)
        true
      }
      else -> false
    }
    "baselineAlignedChildIndex" -> when {
      v is LinearLayoutCompat && arg is Int -> {
        v.setBaselineAlignedChildIndex(arg)
        true
      }
      else -> false
    }
    "dividerDrawable" -> when {
      v is LinearLayoutCompat && arg is Drawable -> {
        v.setDividerDrawable(arg)
        true
      }
      else -> false
    }
    "dividerPadding" -> when {
      v is LinearLayoutCompat && arg is Int -> {
        v.setDividerPadding(arg)
        true
      }
      else -> false
    }
    "gravity" -> when {
      v is LinearLayoutCompat && arg is Int -> {
        v.setGravity(arg)
        true
      }
      else -> false
    }
    "horizontalGravity" -> when {
      v is LinearLayoutCompat && arg is Int -> {
        v.setHorizontalGravity(arg)
        true
      }
      else -> false
    }
    "measureWithLargestChildEnabled" -> when {
      v is LinearLayoutCompat && arg is Boolean -> {
        v.setMeasureWithLargestChildEnabled(arg)
        true
      }
      else -> false
    }
    "orientation" -> when {
      v is LinearLayoutCompat && arg is Int -> {
        v.setOrientation(arg)
        true
      }
      else -> false
    }
    "showDividers" -> when {
      v is LinearLayoutCompat && arg is Int -> {
        v.setShowDividers(arg)
        true
      }
      else -> false
    }
    "verticalGravity" -> when {
      v is LinearLayoutCompat && arg is Int -> {
        v.setVerticalGravity(arg)
        true
      }
      else -> false
    }
    "weightSum" -> when {
      v is LinearLayoutCompat && arg is Float -> {
        v.setWeightSum(arg)
        true
      }
      else -> false
    }
    "allowCollapse" -> when {
      v is ScrollingTabContainerView && arg is Boolean -> {
        v.setAllowCollapse(arg)
        true
      }
      else -> false
    }
    "contentHeight" -> when {
      v is ScrollingTabContainerView && arg is Int -> {
        v.setContentHeight(arg)
        true
      }
      else -> false
    }
    "tabSelected" -> when {
      v is ScrollingTabContainerView && arg is Int -> {
        v.setTabSelected(arg)
        true
      }
      else -> false
    }
    "showText" -> when {
      v is SwitchCompat && arg is Boolean -> {
        v.setShowText(arg)
        true
      }
      else -> false
    }
    "splitTrack" -> when {
      v is SwitchCompat && arg is Boolean -> {
        v.setSplitTrack(arg)
        true
      }
      else -> false
    }
    "switchMinWidth" -> when {
      v is SwitchCompat && arg is Int -> {
        v.setSwitchMinWidth(arg)
        true
      }
      else -> false
    }
    "switchPadding" -> when {
      v is SwitchCompat && arg is Int -> {
        v.setSwitchPadding(arg)
        true
      }
      else -> false
    }
    "switchTypeface" -> when {
      v is SwitchCompat && arg is Typeface -> {
        v.setSwitchTypeface(arg)
        true
      }
      else -> false
    }
    "textOff" -> when {
      v is SwitchCompat && arg is CharSequence -> {
        v.setTextOff(arg)
        true
      }
      else -> false
    }
    "textOn" -> when {
      v is SwitchCompat && arg is CharSequence -> {
        v.setTextOn(arg)
        true
      }
      else -> false
    }
    "thumbDrawable" -> when {
      v is SwitchCompat && arg is Drawable -> {
        v.setThumbDrawable(arg)
        true
      }
      else -> false
    }
    "thumbResource" -> when {
      v is SwitchCompat && arg is Int -> {
        v.setThumbResource(arg)
        true
      }
      else -> false
    }
    "thumbTextPadding" -> when {
      v is SwitchCompat && arg is Int -> {
        v.setThumbTextPadding(arg)
        true
      }
      else -> false
    }
    "thumbTintList" -> when {
      v is SwitchCompat && arg is ColorStateList? -> {
        v.setThumbTintList(arg)
        true
      }
      else -> false
    }
    "thumbTintMode" -> when {
      v is SwitchCompat && arg is PorterDuff.Mode? -> {
        v.setThumbTintMode(arg)
        true
      }
      else -> false
    }
    "trackDrawable" -> when {
      v is SwitchCompat && arg is Drawable -> {
        v.setTrackDrawable(arg)
        true
      }
      else -> false
    }
    "trackResource" -> when {
      v is SwitchCompat && arg is Int -> {
        v.setTrackResource(arg)
        true
      }
      else -> false
    }
    "trackTintList" -> when {
      v is SwitchCompat && arg is ColorStateList? -> {
        v.setTrackTintList(arg)
        true
      }
      else -> false
    }
    "trackTintMode" -> when {
      v is SwitchCompat && arg is PorterDuff.Mode? -> {
        v.setTrackTintMode(arg)
        true
      }
      else -> false
    }
    "collapseContentDescription" -> when {
      v is Toolbar && arg is CharSequence? -> {
        v.setCollapseContentDescription(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setCollapseContentDescription(arg)
        true
      }
      else -> false
    }
    "collapseIcon" -> when {
      v is Toolbar && arg is Drawable? -> {
        v.setCollapseIcon(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setCollapseIcon(arg)
        true
      }
      else -> false
    }
    "collapsible" -> when {
      v is Toolbar && arg is Boolean -> {
        v.setCollapsible(arg)
        true
      }
      else -> false
    }
    "contentInsetEndWithActions" -> when {
      v is Toolbar && arg is Int -> {
        v.setContentInsetEndWithActions(arg)
        true
      }
      else -> false
    }
    "contentInsetStartWithNavigation" -> when {
      v is Toolbar && arg is Int -> {
        v.setContentInsetStartWithNavigation(arg)
        true
      }
      else -> false
    }
    "logoDescription" -> when {
      v is Toolbar && arg is CharSequence -> {
        v.setLogoDescription(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setLogoDescription(arg)
        true
      }
      else -> false
    }
    "navigationContentDescription" -> when {
      v is Toolbar && arg is CharSequence? -> {
        v.setNavigationContentDescription(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setNavigationContentDescription(arg)
        true
      }
      else -> false
    }
    "navigationIcon" -> when {
      v is Toolbar && arg is Drawable? -> {
        v.setNavigationIcon(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setNavigationIcon(arg)
        true
      }
      else -> false
    }
    "navigationOnClickListener" -> when {
      v is Toolbar && arg is View.OnClickListener -> {
        v.setNavigationOnClickListener(arg)
        true
      }
      else -> false
    }
    "subtitle" -> when {
      v is Toolbar && arg is CharSequence -> {
        v.setSubtitle(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setSubtitle(arg)
        true
      }
      else -> false
    }
    "subtitleTextColor" -> when {
      v is Toolbar && arg is ColorStateList -> {
        v.setSubtitleTextColor(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setSubtitleTextColor(arg)
        true
      }
      else -> false
    }
    "titleMarginBottom" -> when {
      v is Toolbar && arg is Int -> {
        v.setTitleMarginBottom(arg)
        true
      }
      else -> false
    }
    "titleMarginEnd" -> when {
      v is Toolbar && arg is Int -> {
        v.setTitleMarginEnd(arg)
        true
      }
      else -> false
    }
    "titleMarginStart" -> when {
      v is Toolbar && arg is Int -> {
        v.setTitleMarginStart(arg)
        true
      }
      else -> false
    }
    "titleMarginTop" -> when {
      v is Toolbar && arg is Int -> {
        v.setTitleMarginTop(arg)
        true
      }
      else -> false
    }
    "titleTextColor" -> when {
      v is Toolbar && arg is ColorStateList -> {
        v.setTitleTextColor(arg)
        true
      }
      v is Toolbar && arg is Int -> {
        v.setTitleTextColor(arg)
        true
      }
      else -> false
    }
    "inflatedId" -> when {
      v is ViewStubCompat && arg is Int -> {
        v.setInflatedId(arg)
        true
      }
      else -> false
    }
    "layoutInflater" -> when {
      v is ViewStubCompat && arg is LayoutInflater -> {
        v.setLayoutInflater(arg)
        true
      }
      else -> false
    }
    "layoutResource" -> when {
      v is ViewStubCompat && arg is Int -> {
        v.setLayoutResource(arg)
        true
      }
      else -> false
    }
    "onInflate" -> when {
      v is ViewStubCompat -> when {
        arg == null -> {
          v.setOnInflateListener(null as? ViewStubCompat.OnInflateListener?)
          true
        }
        arg is Function<*> -> {
          arg as ((arg0: ViewStubCompat, arg1: View) -> Unit)?
          v.setOnInflateListener { arg0, arg1 ->
            arg(arg0, arg1).also { Inkremental.render() }
          }
          true
        }
        else -> false
      }
      else -> false
    }
    else -> false
  }
}
