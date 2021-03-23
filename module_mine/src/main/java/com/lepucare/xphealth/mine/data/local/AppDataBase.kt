package com.lepucare.xphealth.mine.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.lepucare.xphealth.mine.data.entity.PokemonEntity
import com.lepucare.xphealth.mine.data.entity.PokemonInfoEntity
import com.lepucare.xphealth.mine.data.entity.RemoteKeysEntity
import com.lepucare.xphealth.mine.data.local.dao.PokemonDao
import com.lepucare.xphealth.mine.data.local.dao.PokemonInfoDao
import com.lepucare.xphealth.mine.data.local.dao.RemoteKeysDao


@Database(
    entities = arrayOf(PokemonEntity::class, RemoteKeysEntity::class, PokemonInfoEntity::class),
    version = 2, exportSchema = false
)
@TypeConverters(value = arrayOf(LocalTypeConverter::class))
abstract class AppDataBase : RoomDatabase() {

    abstract fun pokemonDao(): PokemonDao
    abstract fun remoteKeysDao(): RemoteKeysDao
    abstract fun pokemonInfoDao(): PokemonInfoDao
}
