package cn.android52.demo.ktx

import android.view.View
import androidx.core.view.iterator
import com.google.android.material.bottomnavigation.BottomNavigationView

fun BottomNavigationView.disableTooltipText() {
    val menuIterator = menu.iterator()
    while (menuIterator.hasNext()) {
        val menu = menuIterator.next()
        findViewById<View>(menu.itemId)?.setOnLongClickListener { true }
    }
}