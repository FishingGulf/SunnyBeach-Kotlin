package cn.android52.demo.ktx

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * 用于简化 Activity 跳转的扩展函数
 */
inline fun <reified T> Context.startActivity(block: (Intent) -> Unit = {}) {
    val intent = Intent(this, T::class.java).apply {
        if (this !is Activity) {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        block.invoke(this)
    }
    startActivity(intent)
}