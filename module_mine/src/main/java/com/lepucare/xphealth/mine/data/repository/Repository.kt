package com.lepucare.xphealth.mine.data.repository

import androidx.paging.PagingData
import com.lepucare.xphealth.mine.data.remote.PokemonResult
import com.lepucare.xphealth.mine.model.PokemonInfoModel
import com.lepucare.xphealth.mine.model.PokemonItemModel
import kotlinx.coroutines.flow.Flow

/**
 * module_mine的Repository接口，定义所有的数据请求方法，包含从本地和网络
 */
interface Repository {
    fun fetchPokemonList(): Flow<PagingData<PokemonItemModel>>

    suspend fun fetchPokemonInfo(name: String): Flow<PokemonResult<PokemonInfoModel>>

    suspend fun fetchPokemonByParameter(parameter: String): Flow<PagingData<PokemonItemModel>>
}