package cn.android52.demo.ui.activity

import android.annotation.SuppressLint
import androidx.appcompat.widget.TooltipCompat
import androidx.core.content.ContextCompat
import by.kirich1409.viewbindingdelegate.viewBinding
import cn.android52.demo.R
import cn.android52.demo.app.AppActivity
import cn.android52.demo.databinding.BadgeActivityBinding
import cn.android52.demo.ktx.createBadge
import cn.android52.demo.ktx.disableTooltipText
import com.google.android.material.badge.BadgeUtils

/**
 *    author : A Lonely Cat
 *    github : https://github.com/getActivity/AndroidProject-Kotlin
 *    time   : 2022/02/08
 *    desc   : Badge 界面，使用
 */
class BadgeActivity : AppActivity() {

    private val mBinding by viewBinding(BadgeActivityBinding::bind)

    override fun getLayoutId(): Int = R.layout.badge_activity

    @SuppressLint("UnsafeOptInUsageError")
    override fun initView() {
        title = "Badge Demo"
        supportActionBar?.hide()
        mBinding.tvFriend.createBadge { view, badgeDrawable ->
            badgeDrawable.number = 999
            BadgeUtils.attachBadgeDrawable(badgeDrawable, view)
        }
        mBinding.tabLayout.apply {
            val tabCount = tabCount
            repeat(tabCount) {
                getTabAt(it)?.view?.let { tabView ->
                    TooltipCompat.setTooltipText(tabView, null)
                }
            }
            getTabAt(0)?.orCreateBadge?.number = 1000
        }
        mBinding.btnBadge.createBadge { view, badgeDrawable ->
            badgeDrawable.horizontalOffset = 16
            badgeDrawable.verticalOffset = 16
            badgeDrawable.number = 999
            BadgeUtils.attachBadgeDrawable(badgeDrawable, view)
        }
        mBinding.ivBadge.createBadge { view, badgeDrawable ->
            badgeDrawable.number = 999
            BadgeUtils.attachBadgeDrawable(badgeDrawable, view)
        }
        mBinding.bottomNav.apply {
            menu.add(0x110, 0x111, 0, "QQ").icon = ContextCompat.getDrawable(context, R.drawable.share_qq_ic)
            menu.add(0x110, 0x112, 1, "微信").icon = ContextCompat.getDrawable(context, R.drawable.share_wechat_ic)
            menu.add(0x110, 0x113, 2, "朋友圈").icon = ContextCompat.getDrawable(context, R.drawable.share_qzone_ic)
        }.also {
            it.disableTooltipText()

            val qqBadgeDrawable = it.getOrCreateBadge(0x111)
            qqBadgeDrawable.verticalOffset = 10
            qqBadgeDrawable.number = 1000

            val weChatBadgeDrawable = it.getOrCreateBadge(0x112)
            weChatBadgeDrawable.clearNumber()
        }
    }

    override fun initData() {

    }
}