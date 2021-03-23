package com.lepucare.xphealth.mine.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lepucare.xphealth.mine.data.entity.PokemonEntity

@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPokemon(pokemonList: List<PokemonEntity>)


    @Query("DELETE FROM PokemonEntity where remoteName = :name")
    suspend fun clearPokemon(name: String)
    /**
     * 用PagingSource封装列表数据
     * @return PagingSource<Int, PokemonEntity>
     */
    @Query("SELECT * FROM PokemonEntity")
    fun getPokemon(): PagingSource<Int, PokemonEntity>


    @Query("SELECT * FROM PokemonEntity where name LIKE '%' || :parameter || '%'")
    fun pokemonInfoByParameter(parameter: String): PagingSource<Int, PokemonEntity>

}