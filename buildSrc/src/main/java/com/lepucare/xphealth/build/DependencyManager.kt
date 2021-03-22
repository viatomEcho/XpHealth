package com.lepucare.xphealth.build

/**
 * 依赖库管理
 */
object Version {
    // AndroidX--------------------------------------------------------------
    const val ActivityKtx = "1.1.0"
    const val FragmentKtx = "1.2.5"
    const val Navigation = "2.3.3"
    // Android---------------------------------------------------------------
    const val Gradle = "4.1.1"

    // JetPack---------------------------------------------------------------
    const val LifecycleViewModel = "2.2.0"
    const val LifecycleRuntimeKtx = "2.2.0"
    const val LifecycleViewModelKtx = "2.2.0"

    const val DataStore = "1.0.0-alpha07"              //DataStore
    const val DataStoreCore = "1.0.0-alpha07"         //Proto DataStore
    const val ProtoBuf = "3.10.0"
    const val ProtoBufPlugin = "0.8.12"





    // GitHub----------------------------------------------------------------
    const val ARoute = "1.5.0"                          // 阿里路由
    const val ARouteCompiler = "1.2.2"                  // 阿里路由 APT
    const val LiveEventBus = "1.7.3"                    // 事件总线
    const val LepuBle = "1.0.10dev1"                        //蓝牙



}


object JetPack {
    const val LifecycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel:${Version.LifecycleViewModel}"
    const val LifecycleRuntimeKtx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Version.LifecycleRuntimeKtx}"
    const val LifecycleViewModelKtx =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.LifecycleViewModelKtx}"

}


object DataStore{
    // proto dataStore
    const val DataStore =
        "androidx.datastore:datastore:${Version.DataStore}"
    const val DataStore_Core =
        "androidx.datastore:datastore-core:${Version.DataStoreCore}"
    const val ProtoBuf =
        "com.google.protobuf:protobuf-javalite:${Version.ProtoBuf}"
    const val ProtoBuf_Protoc =
        "com.google.protobuf:protoc:${Version.ProtoBuf}"

}


object GitHub {
    const val ARoute = "com.alibaba:arouter-api:${Version.ARoute}"
    const val ARouteCompiler = "com.alibaba:arouter-compiler:${Version.ARouteCompiler}"
    const val LiveEventBus = "com.jeremyliao:live-event-bus-x:${Version.LiveEventBus}"
    const val LepuBle = "com.lepu.blepro:lepu-ble:${Version.LepuBle}"

}





object Versions {
    const val retrofit = "2.9.0"
    const val okhttpLogging = "4.9.0"
    const val appcompat = "1.2.0"
    const val coreKtx = "1.3.2"
    const val constraintlayout = "2.0.4"
    const val paging = "3.0.0-alpha02"
    const val timber = "4.7.1"
    const val kotlin = "1.4.20"
    const val kotlinCoroutinesCore = "1.3.7"
    const val kotlinCoroutinesAndrid = "1.3.6"
    const val koin = "2.1.5"
    const val work = "2.2.0"
    const val room = "2.2.6"
    const val cardview = "1.0.0"
    const val recyclerview = "1.0.0"
    const val fragment = "1.3.0-alpha06"
    const val anko = "0.10.8"
    const val swiperefreshlayout = "1.1.0"
    const val junit = "4.13.1"
    const val junitExt = "1.1.2"
    const val espressoCore = "3.3.0"
    const val jDatabinding = "1.0.4"
    const val runtime = "1.1.0"
    const val hit = "2.28-alpha"
    const val hitViewModule = "1.0.0-alpha01"
    const val appStartup = "1.0.0"
    const val material = "1.2.1"
    const val navigation = "2.3.3"

}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"

    const val workRuntime = "androidx.work:work-runtime:${Versions.work}"
    const val workTesting = "androidx.work:work-testing:${Versions.work}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val swiperefreshlayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshlayout}"
    const val appStartup = "androidx.startup:startup-runtime:${Versions.appStartup}"


    const val AndroidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val ActivityKtx = "androidx.activity:activity-ktx:${Version.ActivityKtx}"
    const val FragmentKtx = "androidx.fragment:fragment-ktx:${Version.FragmentKtx}"
    const val Navigation = "androidx.navigation:navigation-ui-ktx:${Version.Navigation}"
    const val NavigationFragment = "androidx.navigation:navigation-fragment-ktx:${Version.Navigation}"
}

object Android {
    const val meteria = "com.google.android.material:material:${Versions.material}"
}

object Hilt {
    const val daggerRuntime = "com.google.dagger:hilt-android:${Versions.hit}"
    const val daggerCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hit}"
    const val viewModule = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hitViewModule}"
    const val compiler = "androidx.hilt:hilt-compiler:${Versions.hitViewModule}"


}

object Coil {
    const val runtime = "io.coil-kt:coil:${Versions.runtime}"
}

object Room {
    const val runtime = "androidx.room:room-runtime:${Versions.room}"
    const val compiler = "androidx.room:room-compiler:${Versions.room}"
    const val ktx = "androidx.room:room-ktx:${Versions.room}"
    const val rxjava2 = "androidx.room:room-rxjava2:${Versions.room}"
    const val testing = "androidx.room:room-testing:${Versions.room}"
}

object Fragment {
    const val runtime = "androidx.fragment:fragment:${Versions.fragment}"
    const val runtimeKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
}

object Kt {
    const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutinesCore}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutinesAndrid}"
    const val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Koin {
    const val core = "org.koin:koin-core:${Versions.koin}"
    const val androidCore = "org.koin:koin-android:${Versions.koin}"
    const val viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val androidScope = "org.koin:koin-android-scope:$${Versions.koin}"
}

object Anko {
    const val common = "org.jetbrains.anko:anko-common:${Versions.anko}"
    const val sqlite = "org.jetbrains.anko:anko-sqlite:${Versions.anko}"
    const val coroutines = "org.jetbrains.anko:anko-coroutines:${Versions.anko}"
    const val design = "org.jetbrains.anko:anko-design:${Versions.anko}" // For SnackBars
}

object Retrofit {
    const val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
    const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
}


object Depend {
    const val junit = "junit:junit:${Versions.junit}"
    const val androidTestJunit = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val jDatabinding = "com.hi-dhl:jdatabinding:${Versions.jDatabinding}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object Navigation{
    const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val ktx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}


