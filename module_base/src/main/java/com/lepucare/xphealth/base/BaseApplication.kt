package com.lepucare.xphealth.base


import android.app.Application
import android.content.Context
//import androidx.multidex.MultiDex
import com.alibaba.android.arouter.launcher.ARouter
import dagger.hilt.android.HiltAndroidApp

/**
 * @Class: BaseApplication
 * @Remark: 自定义Application的基类
 *
 * 所有使用 Hilt 的 App 必须包含一个使用 @HiltAndroidApp 注解的 Application。
    @HiltAndroidApp 注解将会触发 Hilt 代码的生成，作为应用程序依赖项容器的基类。
    生成的 Hilt 组件依附于 Application 的生命周期，它也是 App 的父组件，提供其他组件访问的依赖。
    在 Application 中设置好 @HiltAndroidApp 之后，就可以使用 Hilt 提供的组件了，组件包含Application、Activity、Fragment、View、Service、BroadcastReceiver 等等。

 */
@HiltAndroidApp
open class BaseApplication : Application() {

//    companion object {
//        // 全局Context
//        lateinit var context: Context
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//        context = applicationContext
//        initialize()
//
//
//    }

    /**
     * 进行一些初始化的操作
     */
//    protected open fun initialize() {
//
//        // 阿里路由 ARouter 初始化
//        if (BuildConfig.DEBUG) {
//            ARouter.openLog()     // 打印日志
//            ARouter.openDebug()   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
//        }
//        ARouter.init(this)
////
////        // Bugly 初始化 第三个参数为SDK调试模式开关
////        CrashReport.initCrashReport(this, "申请的id", BuildConfig.DEBUG)
//
//
//    }

//    override fun attachBaseContext(base: Context?) {
//        super.attachBaseContext(base)
//        MultiDex.install(base)
//    }
}