package com.lepucare.xphealth.mine.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lepucare.xphealth.mine.data.entity.PokemonInfoEntity


@Dao
interface PokemonInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPokemon(pokemonInfoEntity: PokemonInfoEntity)

    @Query("SELECT * FROM PokemonInfoEntity where name = :name")
    suspend fun getPokemon(name: String): PokemonInfoEntity?

    @Query("DELETE FROM PokemonInfoEntity where id = :id")
    suspend fun clearPokemonInfo(id: Int)
}