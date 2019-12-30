@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package trikita.anvil

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
import kotlin.Any
import kotlin.Boolean
import kotlin.Function
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

fun recyclerView(configure: RecyclerViewScope.() -> Unit = {}) =
    v<RecyclerView>(configure.bind(RecyclerViewScope))
abstract class RecyclerViewScope : ViewGroupScope() {
  fun accessibilityDelegateCompat(arg: RecyclerViewAccessibilityDelegate?): Unit =
      attr("accessibilityDelegateCompat", arg)
  fun adapter(arg: RecyclerView.Adapter<RecyclerView.ViewHolder>?): Unit = attr("adapter", arg)
  fun childDrawingOrderCallback(arg: RecyclerView.ChildDrawingOrderCallback?): Unit =
      attr("childDrawingOrderCallback", arg)
  fun edgeEffectFactory(arg: RecyclerView.EdgeEffectFactory): Unit = attr("edgeEffectFactory", arg)
  fun hasFixedSize(arg: Boolean): Unit = attr("hasFixedSize", arg)
  fun itemAnimator(arg: RecyclerView.ItemAnimator?): Unit = attr("itemAnimator", arg)
  fun itemViewCacheSize(arg: Int): Unit = attr("itemViewCacheSize", arg)
  fun layoutManager(arg: RecyclerView.LayoutManager?): Unit = attr("layoutManager", arg)
  fun onFling(arg: ((arg0: Int, arg1: Int) -> Boolean)?): Unit = attr("onFling", arg)
  fun preserveFocusAfterLayout(arg: Boolean): Unit = attr("preserveFocusAfterLayout", arg)
  fun recycledViewPool(arg: RecyclerView.RecycledViewPool?): Unit = attr("recycledViewPool", arg)
  fun recyclerListener(arg: RecyclerView.RecyclerListener?): Unit = attr("recyclerListener", arg)
  fun scrollingTouchSlop(arg: Int): Unit = attr("scrollingTouchSlop", arg)
  fun viewCacheExtension(arg: RecyclerView.ViewCacheExtension?): Unit = attr("viewCacheExtension",
      arg)
  companion object : RecyclerViewScope() {
    init {
      Anvil.registerAttributeSetter(RecyclerViewv7Setter)
      Anvil.registerAttributeSetter(RecyclerViewDslSetter)
    }
  }
}

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by
 * {@code gradle generateRecyclerViewv7Dsl}
 * It contains views and their setters for the library recyclerview-v7.
 * Please, don't edit it manually unless for debugging.
 */
object RecyclerViewv7Setter : Anvil.AttributeSetter<Any?> {
  override fun set(
    v: View,
    name: String,
    arg: Any?,
    old: Any?
  ): Boolean = when (name) {
    "accessibilityDelegateCompat" -> when {
      v is RecyclerView && arg is RecyclerViewAccessibilityDelegate? -> {
        v.setAccessibilityDelegateCompat(arg as RecyclerViewAccessibilityDelegate)
        true
      }
      else -> false
    }
    "adapter" -> when {
      v is RecyclerView && arg is RecyclerView.Adapter<*>? -> {
        v.setAdapter(arg as RecyclerView.Adapter<RecyclerView.ViewHolder>)
        true
      }
      else -> false
    }
    "childDrawingOrderCallback" -> when {
      v is RecyclerView && arg is RecyclerView.ChildDrawingOrderCallback? -> {
        v.setChildDrawingOrderCallback(arg as RecyclerView.ChildDrawingOrderCallback)
        true
      }
      else -> false
    }
    "edgeEffectFactory" -> when {
      v is RecyclerView && arg is RecyclerView.EdgeEffectFactory -> {
        v.setEdgeEffectFactory(arg)
        true
      }
      else -> false
    }
    "hasFixedSize" -> when {
      v is RecyclerView && arg is Boolean -> {
        v.setHasFixedSize(arg)
        true
      }
      else -> false
    }
    "itemAnimator" -> when {
      v is RecyclerView && arg is RecyclerView.ItemAnimator? -> {
        v.setItemAnimator(arg as RecyclerView.ItemAnimator)
        true
      }
      else -> false
    }
    "itemViewCacheSize" -> when {
      v is RecyclerView && arg is Int -> {
        v.setItemViewCacheSize(arg)
        true
      }
      else -> false
    }
    "layoutManager" -> when {
      v is RecyclerView && arg is RecyclerView.LayoutManager? -> {
        v.setLayoutManager(arg as RecyclerView.LayoutManager)
        true
      }
      else -> false
    }
    "onFling" -> when {
      v is RecyclerView -> when {
        arg == null -> {
          v.setOnFlingListener(null as? RecyclerView.OnFlingListener?)
          true
        }
        arg is Function<*> -> {
          arg as ((arg0: Int, arg1: Int) -> Boolean)?
          v.setOnFlingListener(object : RecyclerView.OnFlingListener() {
            override fun onFling(arg0: Int, arg1: Int): Boolean = arg(arg0, arg1).also {
                Anvil.render() }
          })
          true
        }
        else -> false
      }
      else -> false
    }
    "preserveFocusAfterLayout" -> when {
      v is RecyclerView && arg is Boolean -> {
        v.setPreserveFocusAfterLayout(arg)
        true
      }
      else -> false
    }
    "recycledViewPool" -> when {
      v is RecyclerView && arg is RecyclerView.RecycledViewPool? -> {
        v.setRecycledViewPool(arg as RecyclerView.RecycledViewPool)
        true
      }
      else -> false
    }
    "recyclerListener" -> when {
      v is RecyclerView && arg is RecyclerView.RecyclerListener? -> {
        v.setRecyclerListener(arg as RecyclerView.RecyclerListener)
        true
      }
      else -> false
    }
    "scrollingTouchSlop" -> when {
      v is RecyclerView && arg is Int -> {
        v.setScrollingTouchSlop(arg)
        true
      }
      else -> false
    }
    "viewCacheExtension" -> when {
      v is RecyclerView && arg is RecyclerView.ViewCacheExtension? -> {
        v.setViewCacheExtension(arg as RecyclerView.ViewCacheExtension)
        true
      }
      else -> false
    }
    else -> false
  }
}
