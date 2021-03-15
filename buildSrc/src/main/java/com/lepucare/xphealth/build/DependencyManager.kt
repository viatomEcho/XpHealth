package com.lepucare.xphealth.build

/**
 * 依赖库管理
 */
object Version {
    // AndroidX--------------------------------------------------------------
    const val AppCompat = "1.2.0"
    const val CoreKtx = "1.3.1"
    const val ConstraintLayout = "2.0.1"                // 约束布局
    const val TestExtJunit = "1.1.2"
    const val TestEspresso = "3.3.0"
    const val ActivityKtx = "1.1.0"
    const val FragmentKtx = "1.2.5"
    const val MultiDex = "2.0.1"

    // Android---------------------------------------------------------------
    const val Junit = "4.13"
    const val Material = "1.2.0"

    // Kotlin----------------------------------------------------------------
    const val Kotlin = "1.4.0"
    const val Coroutines = "1.3.7"                      // 协程

    // JetPack---------------------------------------------------------------
    const val LifecycleViewModel = "2.2.0"
    const val LifecycleRuntimeKtx = "2.2.0"
    const val LifecycleViewModelKtx = "2.2.0"


    // GitHub----------------------------------------------------------------
    const val OkHttp = "3.14.9"                         // OkHttp
    const val OkHttpInterceptorLogging = "3.12.0"       // OkHttp 请求Log拦截器
    const val Retrofit = "2.9.0"                        // Retrofit
    const val RetrofitConverterGson = "2.9.0"           // Retrofit Gson 转换器
    const val Gson = "2.8.6"                            // Gson
    const val MMKV = "1.2.2"                            // 腾讯 MMKV 替代SP
    const val AutoSize = "1.2.1"                        // 屏幕适配
    const val Glide = "4.11.0"                          // Glide
    const val ARoute = "1.5.0"                          // 阿里路由
    const val ARouteCompiler = "1.2.2"                  // 阿里路由 APT
    const val RecyclerViewAdapter = "3.0.4"             // RecyclerViewAdapter
    const val StatusBar = "1.5.1"                       // 状态栏
    const val LiveEventBus = "1.7.3"                    // 事件总线
    const val Bugly = "3.2.33"                          // Bugly 异常上报
    const val PermissionX = "1.3.0"                     // 权限申请
    const val LeakCanary = "2.4"                        // 检测内存泄漏
    const val Chuck = "1.1.0"                           // OkHttp 请求信息拦截器(UI)
    const val SpinKit = "1.4.0"                         // 加载图

    const val LepuBle = "1.0.10dev1"                        //蓝牙
}

object AndroidX {
    const val AndroidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val AppCompat = "androidx.appcompat:appcompat:${Version.AppCompat}"
    const val CoreKtx = "androidx.core:core-ktx:${Version.CoreKtx}"
    const val ConstraintLayout =
        "androidx.constraintlayout:constraintlayout:${Version.ConstraintLayout}"
    const val TestExtJunit = "androidx.test.ext:junit:${Version.TestExtJunit}"
    const val TestEspresso = "androidx.test.espresso:espresso-core:${Version.TestEspresso}"
    const val ActivityKtx = "androidx.activity:activity-ktx:${Version.ActivityKtx}"
    const val FragmentKtx = "androidx.fragment:fragment-ktx:${Version.FragmentKtx}"
    const val MultiDex = "androidx.multidex:multidex:${Version.MultiDex}"
}

object Android {
    const val Junit = "junit:junit:${Version.Junit}"
    const val Material = "com.google.android.material:material:${Version.Material}"
}

object JetPack {
    const val LifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel:${Version.LifecycleViewModel}"
    const val LifecycleRuntimeKtx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Version.LifecycleRuntimeKtx}"
    const val LifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.LifecycleViewModelKtx}"
}

object Kotlin {
    const val Kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.Kotlin}"
    const val CoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.Coroutines}"
    const val CoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.Coroutines}"
}

object GitHub {
    const val OkHttp = "com.squareup.okhttp3:okhttp:${Version.OkHttp}"
    const val OkHttpInterceptorLogging =
        "com.squareup.okhttp3:logging-interceptor:${Version.OkHttpInterceptorLogging}"
    const val Retrofit = "com.squareup.retrofit2:retrofit:${Version.Retrofit}"
    const val RetrofitConverterGson =
        "com.squareup.retrofit2:converter-gson:${Version.RetrofitConverterGson}"
    const val Gson = "com.google.code.gson:gson:${Version.Gson}"
    const val MMKV = "com.tencent:mmkv-static:${Version.MMKV}" //准备弃用
    const val AutoSize = "me.jessyan:autosize:${Version.AutoSize}"
    const val Glide = "com.github.bumptech.glide:glide:${Version.Glide}"
    const val GlideCompiler = "com.github.bumptech.glide:compiler:${Version.Glide}"
    const val ARoute = "com.alibaba:arouter-api:${Version.ARoute}"
    const val ARouteCompiler = "com.alibaba:arouter-compiler:${Version.ARouteCompiler}"
    const val RecyclerViewAdapter =
        "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Version.RecyclerViewAdapter}"
    const val StatusBar = "com.jaeger.statusbarutil:library:${Version.StatusBar}"
    const val Bugly = "com.tencent.bugly:crashreport:${Version.Bugly}"
    const val PermissionX = "com.permissionx.guolindev:permissionx:${Version.PermissionX}"
    const val LeakCanary = "com.squareup.leakcanary:leakcanary-android:${Version.LeakCanary}"
    const val Chuck = "com.readystatesoftware.chuck:library:${Version.Chuck}"
    const val ChuckNo = "com.readystatesoftware.chuck:library-no-op:${Version.Chuck}"
    const val SpinKit = "com.github.ybq:Android-SpinKit:${Version.SpinKit}"
    const val LiveEventBus = "com.jeremyliao:live-event-bus-x:${Version.LiveEventBus}"
    const val LepuBle = "com.lepu.blepro:lepu-ble:${Version.LepuBle}"
}