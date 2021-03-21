package com.lepucare.xphealth.common

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.lepucare.xphealth.base.BaseApplication
import com.lepucare.xphealth.base.utils.ActivityStackManager

/**
 * @Class: CommonApplication
 * @Remark: 项目相关的Application
 */

open class CommonApplication : BaseApplication(), Application.ActivityLifecycleCallbacks {

    override fun onCreate() {
        super.onCreate()
        // 全局监听 Activity 生命周期
        registerActivityLifecycleCallbacks(this)
    }

    override fun onActivityCreated(activity: Activity, bundle: Bundle?) {
        ActivityStackManager.addActivityToStack(activity)
    }

    override fun onActivityStarted(activity: Activity) {}
    override fun onActivityResumed(activity: Activity) {}
    override fun onActivityPaused(activity: Activity) {}
    override fun onActivityStopped(activity: Activity) {}
    override fun onActivitySaveInstanceState(activity: Activity, bundle: Bundle) {}
    override fun onActivityDestroyed(activity: Activity) {
        ActivityStackManager.popActivityToStack(activity)
    }
}