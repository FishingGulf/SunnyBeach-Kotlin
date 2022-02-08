package cn.android52.demo.ktx

import android.util.DisplayMetrics
import android.util.TypedValue
import cn.android52.demo.manager.ActivityManager

val Number.dp
    get(): Int {
        val am = ActivityManager.getInstance()
        val context = am.getApplication()
        val resources = context.resources
        val displayMetrics: DisplayMetrics = resources.displayMetrics
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), displayMetrics).toInt()
    }