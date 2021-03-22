package com.lepucare.xphealth.base

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter

object AppHelper {
    lateinit var mContext: Context

    fun init(context: Context) {
        this.mContext = context

        // 阿里路由 ARouter 初始化
        if (BuildConfig.DEBUG) {
            ARouter.openLog()     // 打印日志
            ARouter.openDebug()   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(context as Application)
    }
}