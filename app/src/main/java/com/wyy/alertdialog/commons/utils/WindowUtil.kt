package com.wyy.alertdialog.commons.utils

import android.app.Activity
import androidx.fragment.app.FragmentActivity

/**
 * 窗口工具类
 */
object WindowUtil {
    /**
     * 获取窗口的宽度
     * @param activity 传入当前activity
     * @return 返回窗口的宽度
     */
    fun getWidthOfWindow(activity: FragmentActivity): Int {
        val windowMetrics = activity.windowManager.currentWindowMetrics
        return windowMetrics.bounds.width()
    }
}