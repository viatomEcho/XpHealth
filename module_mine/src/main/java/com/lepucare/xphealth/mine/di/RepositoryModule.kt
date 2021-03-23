package com.lepucare.xphealth.mine.di

import com.lepucare.xphealth.data.PokemonFactory
import com.lepucare.xphealth.data.local.AppDataBase
import com.lepucare.xphealth.data.remote.PokemonService
import com.lepucare.xphealth.data.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideTasksRepository(
        api: PokemonService,
        db: AppDataBase
    ): Repository {
        return PokemonFactory.makePokemonRepository(api, db)
    }

}