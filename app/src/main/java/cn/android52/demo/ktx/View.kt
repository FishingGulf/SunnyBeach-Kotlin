package cn.android52.demo.ktx

import android.graphics.Color
import android.view.View
import com.google.android.material.badge.BadgeDrawable

/**
 * BadgeDrawable 构造方法，ThemeEnforcement.checkMaterialTheme(context);
 * throw IllegalArgumentException：The style on this component requires your app theme to be Theme.MaterialComponents.* (or a descendant).
 */
fun View.createBadge(block: (View, BadgeDrawable) -> Unit = { _, _ -> }) {
    post {
        BadgeDrawable.create(context).apply {
            badgeGravity = BadgeDrawable.TOP_END
            // badge 最多显示字符，默认999+ 是4个字符（带'+'号）
            maxCharacterCount = 3
            backgroundColor = Color.RED
            badgeTextColor = Color.WHITE
            block.invoke(this@createBadge, this)
        }
    }
}