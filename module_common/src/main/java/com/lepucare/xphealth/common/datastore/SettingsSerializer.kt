package com.lepucare.xphealth.common.datastore

import android.content.Context
import androidx.datastore.core.CorruptionException
import androidx.datastore.core.DataStore
import androidx.datastore.core.Serializer
import androidx.datastore.dataStore
import com.google.protobuf.InvalidProtocolBufferException
import com.lepucare.xphealth.base.BaseApplication.Companion.context
import com.lepucare.xphealth.common.datastore.protobuf.Settings
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.io.InputStream
import java.io.OutputStream



object SettingsSerializer :Serializer<Settings>{


    override val defaultValue: Settings = Settings.getDefaultInstance()

    override fun readFrom(input: InputStream): Settings {
        try {
            return Settings.parseFrom(input)
        } catch (exception: InvalidProtocolBufferException) {
            throw CorruptionException("Cannot read proto.", exception)
        }
    }

    override fun writeTo(
        t: Settings,
        output: OutputStream
    ) = t.writeTo(output)



}
val Context.settingsDataStore: DataStore<Settings> by dataStore(
    fileName = "settings.pb",
    serializer = SettingsSerializer
)

//val exampleCounterFlow: Flow<Int> = context.settingsDataStore.data
//    .map { settings ->
//        // The exampleCounter property is generated from the proto schema.
//        settings.exampleCounter
//    }

suspend fun setLogin(isLogin: Boolean){
    context.settingsDataStore.updateData {
        it.toBuilder().setIsLogin(isLogin).build()
    }
}

suspend fun isLogin(){
    context.settingsDataStore.data.map { it.isLogin }.first()
}

suspend fun setFirstEnter(isFirst: Boolean){
    context.settingsDataStore.updateData {
        it.toBuilder().setIsFirstEnter(isFirst).build()
    }
}

suspend fun isFirstEnter(){
    context.settingsDataStore.data.map { it.isFirstEnter }.first()
}





