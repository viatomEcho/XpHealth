package com.lepucare.xphealth.mine.data.local

import androidx.room.TypeConverter
import com.google.gson.GsonBuilder
import com.lepucare.xphealth.base.ktx.fromJson
import com.lepucare.xphealth.base.ktx.typedToJson
import com.lepucare.xphealth.mine.data.entity.PokemonInfoEntity


open class LocalTypeConverter {

    @TypeConverter
    fun json2StatsEntity(src: String): List<PokemonInfoEntity.Stats>? =
        GsonBuilder().create().fromJson(src)

    @TypeConverter
    fun statsEntity2Json(data: List<PokemonInfoEntity.Stats>): String =
        GsonBuilder().create().typedToJson(data)

    @TypeConverter
    fun json2TypeEntity(src: String): List<PokemonInfoEntity.Type>? =
        GsonBuilder().create().fromJson(src)

    @TypeConverter
    fun typeEntity2Json(data: List<PokemonInfoEntity.Type>): String =
        GsonBuilder().create().typedToJson(data)

}