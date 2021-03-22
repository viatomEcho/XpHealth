package com.lepucare.xphealth.base.init

import android.content.Context
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.os.StrictMode.VmPolicy
import androidx.startup.Initializer
import com.lepucare.xphealth.base.AppHelper
import com.lepucare.xphealth.base.BuildConfig
import timber.log.Timber
import timber.log.Timber.DebugTree

class AppInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        if (!BuildConfig.DEBUG) {
            return
        }
        StrictMode.setThreadPolicy(
            ThreadPolicy.Builder().detectAll().penaltyLog().build()
        )
        StrictMode.setVmPolicy(VmPolicy.Builder().detectAll().penaltyLog().build())
        Timber.plant(DebugTree())
        AppHelper.init(context)
        return Unit
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}