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

    const val Navigation = "2.3.3"


    // Android---------------------------------------------------------------
    const val Junit = "4.13"
    const val Material = "1.2.0"
    const val Gradle = "4.1.1"



    // Kotlin----------------------------------------------------------------
    const val Kotlin = "1.4.10"
    const val Coroutines = "1.3.7"                      // 协程
    const val WorkManager = "2.5.0"                     //WorkManager


    // JetPack---------------------------------------------------------------
    const val LifecycleViewModel = "2.2.0"
    const val LifecycleRuntimeKtx = "2.2.0"
    const val LifecycleViewModelKtx = "2.2.0"

    const val DataStore = "1.0.0-alpha07"              //DataStore
    const val DataStoreCore = "1.0.0-alpha07"         //Proto DataStore
    const val ProtoBuf = "3.10.0"
    const val ProtoBufPlugin = "0.8.12"

    const val Room = "2.3.0-alpha01"


    // GitHub----------------------------------------------------------------
    const val Gson = "2.8.6"                            // Gson
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
    const val Timber = "4.7.1"

    const val LepuBle = "1.0.10dev1"                        //蓝牙


    //hilt
    const val Hit = "2.28-alpha"
    const val HitViewModule = "1.0.0-alpha01"

    const val Coil = "1.1.0"

    const val Retrofit = "2.9.0"
    const val OkhttpLogging = "4.9.0"


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

    const val Navigation = "androidx.navigation:navigation-ui-ktx:${Version.Navigation}"
    const val NavigationFragment = "androidx.navigation:navigation-fragment-ktx:${Version.Navigation}"

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

    // proto dataStore
    const val DataStore =
            "androidx.datastore:datastore:${Version.DataStore}"
    const val DataStore_Core =
            "androidx.datastore:datastore-core:${Version.DataStoreCore}"
    const val ProtoBuf =
            "com.google.protobuf:protobuf-javalite:${Version.ProtoBuf}"
    const val ProtoBuf_Protoc =
            "com.google.protobuf:protoc:${Version.ProtoBuf}"

    //room
    const val RoomCompiler =
            "androidx.room:room-compiler:${Version.Room}"


    const val paging = "3.0.0-alpha02"



}

object Kotlin {
    const val Kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.Kotlin}"
    const val CoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.Coroutines}"
    const val CoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.Coroutines}"

    const val WorkKtx =
        "androidx.work:work-runtime-ktx:${Version.WorkManager}"




}

object GitHub {
    const val Gson = "com.google.code.gson:gson:${Version.Gson}"
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

    const val timber = "com.jakewharton.timber:timber:${Version.Timber}"


}

object Hilt{

    const val daggerRuntime = "com.google.dagger:hilt-android:${Version.Hit}"
    const val daggerCompiler = "com.google.dagger:hilt-android-compiler:${Version.Hit}"
    const val viewModule = "androidx.hilt:hilt-lifecycle-viewmodel:${Version.HitViewModule}"
    const val compiler = "androidx.hilt:hilt-compiler:${Version.HitViewModule}"
}


object Room {
    const val runtime = "androidx.room:room-runtime:${Version.Room}"
    const val compiler = "androidx.room:room-compiler:${Version.Room}"
    const val ktx = "androidx.room:room-ktx:${Version.Room}"
    const val rxjava2 = "androidx.room:room-rxjava2:${Version.Room}"
    const val testing = "androidx.room:room-testing:${Version.Room}"
}

object Coil {
    const val runtime = "io.coil-kt:coil:${Version.Coil}"
}

object Retrofit {
    const val runtime = "com.squareup.retrofit2:retrofit:${Version.Retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Version.Retrofit}"
    const val mock = "com.squareup.retrofit2:retrofit-mock:${Version.Retrofit}"
    const val logging = "com.squareup.okhttp3:logging-interceptor:${Version.OkhttpLogging}"
}


