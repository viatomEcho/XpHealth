package com.lepucare.xphealth.mine.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 需要保存到room的实例
 * @property name String
 * @property pokemonId Int
 * @property page Int
 * @property url String
 * @property remoteName String
 * @constructor
 */
@Entity
data class PokemonEntity(
    @PrimaryKey
    val name: String,
    var pokemonId: Int = 0,
    val page: Int = 0,
    val url: String,
    val remoteName: String
)