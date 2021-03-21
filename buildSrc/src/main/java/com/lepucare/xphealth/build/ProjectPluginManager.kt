package com.lepucare.xphealth.build

/**
 * 项目级插件管理
 */
object ProjectPluginManager {
    const val AndroidToolsPlugin = "com.android.tools.build:gradle:${Version.Gradle}"
    const val KotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.Kotlin}"

    const val ProtoBufPlugin = "com.google.protobuf:protobuf-gradle-plugin:${Version.ProtoBufPlugin}"
    const val HiltAndroidPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Version.Hit}"
}