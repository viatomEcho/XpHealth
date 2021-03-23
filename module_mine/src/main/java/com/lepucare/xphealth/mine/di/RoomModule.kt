package com.lepucare.xphealth.mine.di

import android.app.Application
import androidx.room.Room
import com.lepucare.xphealth.data.local.AppDataBase
import com.lepucare.xphealth.data.local.dao.PokemonDao
import com.lepucare.xphealth.data.local.dao.PokemonInfoDao
import com.lepucare.xphealth.data.local.dao.RemoteKeysDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
// 这里使用了 ApplicationComponent，因此 NetworkModule 绑定到 Application 的生命周期。
object RoomModule {

    /**
     * @Provides 常用于被 @Module 注解标记类的内部的方法，并提供依赖项对象。
     * @Singleton 提供单例
     */
    @Provides
    @Singleton
    fun provideAppDataBase(application: Application): AppDataBase {
        return Room
            .databaseBuilder(application, AppDataBase::class.java, "dhl.db")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun providerPokemonDao(appDataBase: AppDataBase): PokemonDao {
        return appDataBase.pokemonDao()
    }

    @Provides
    @Singleton
    fun providerPokemonInfoDao(appDataBase: AppDataBase): PokemonInfoDao {
        return appDataBase.pokemonInfoDao()
    }

    @Provides
    @Singleton
    fun providerRemoteKeysDao(appDataBase: AppDataBase): RemoteKeysDao {
        return appDataBase.remoteKeysDao()
    }
}