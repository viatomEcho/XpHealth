package com.lepucare.xphealth.mine.data.remote

import com.lepucare.xphealth.mine.data.entity.ListingResponse
import com.lepucare.xphealth.mine.data.entity.NetWorkPokemonInfo
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * 网络接口服务
 */
interface PokemonService {
    @GET("pokemon")
    suspend fun fetchPokemonList(
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0
    ): ListingResponse

    @GET("pokemon/{name}")
    suspend fun fetchPokemonInfo(@Path("name") name: String): NetWorkPokemonInfo
}