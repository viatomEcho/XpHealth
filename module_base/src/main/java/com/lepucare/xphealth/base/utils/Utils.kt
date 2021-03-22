package com.lepucare.xphealth.base.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.alibaba.android.arouter.launcher.ARouter
import com.jeremyliao.liveeventbus.LiveEventBus
import com.lepucare.xphealth.base.AppHelper
import com.lepucare.xphealth.base.BaseApplication
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

/**
 * 以顶层函数存在的常用工具方法
 * startPolling() -> 开启一个轮询
 * sendEvent() -> 发送普通LiveEventBus事件
 * toastShow() -> Toast
 * isNetworkAvailable() -> 检查是否连接网络
 * aRouterJump() -> 阿里路由不带参数跳转
 */
/**************************************************************************************************/
/**
 * 使用 Flow 做的简单的轮询
 * 请使用单独的协程来进行管理该 Flow
 * Flow 仍有一些操作符是实验性的 使用时需添加 @InternalCoroutinesApi 注解
 * @param intervals 轮询间隔时间/毫秒
 * @param block 需要执行的代码块
 */
suspend fun startPolling(intervals: Long, block: () -> Unit) {
    flow {
        while (true) {
            delay(intervals)
            emit(0)
        }
    }
        .catch { Log.e("flow", "startPolling: $it") }
        .flowOn(Dispatchers.Main)
        .collect { block.invoke() }
}
/**************************************************************************************************/

/**
 * 发送普通LiveEventBus事件
 */
fun sendEvent(key: String, data: Any) =  LiveEventBus.get(key).post(data)

/**************************************************************************************************/
private var mToast: Toast? = null

/**
 * Toast
 * Android 9.0之上 已做优化
 */
fun toastShow(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
        Toast.makeText(AppHelper.mContext, text, duration).show()
    } else {
        if (mToast != null) {
            mToast?.setText(text)
            mToast?.show()
        } else {
            mToast = Toast.makeText(AppHelper.mContext, text, duration)
            mToast?.show()
        }
    }
}

/**************************************************************************************************/
/**
 * 判断是否连接网络
 */
@SuppressLint("MissingPermission")
fun isNetworkAvailable(): Boolean {
    val connectivityManager: ConnectivityManager? =
        AppHelper.mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    if (connectivityManager == null) {
        return false
    } else {
        val allNetworkInfo: Array<NetworkInfo>? = connectivityManager.allNetworkInfo
        if (allNetworkInfo != null && allNetworkInfo.isNotEmpty()) {
            allNetworkInfo.forEach {
                if (it.state == NetworkInfo.State.CONNECTED) {
                    return true
                }
            }
        }
    }
    return false
}

/**************************************************************************************************/
/**
 * 阿里路由不带参数跳转
 * @param routerUrl String 路由地址
 */
fun aRouterJump(routerUrl: String) {
    ARouter.getInstance().build(routerUrl).navigation()
}


fun aRouterJump(activity: Activity,routerUrl: String,  requestCode: Int) {
    ARouter.getInstance().build(routerUrl).navigation(activity, requestCode)
}

fun aRouterJump(routerUrl: String, bundle: Bundle) {
    ARouter.getInstance().build(routerUrl).with(bundle).navigation()
}

fun aRouterJump(activity: Activity, routerUrl: String, bundle: Bundle, requestCode: Int) {
    ARouter.getInstance().build(routerUrl).with(bundle).navigation(activity, requestCode)
}
