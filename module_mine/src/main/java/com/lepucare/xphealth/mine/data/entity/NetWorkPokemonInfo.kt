package com.lepucare.xphealth.mine.data.entity

import com.google.gson.annotations.SerializedName

/**
 * 一个接口响应的实例
 * @property name String
 * @property height Int
 * @property weight Int
 * @property experience Int
 * @property types List<Types>
 * @property stats List<Stats>
 * @property sprites Sprites
 * @constructor
 */
data class NetWorkPokemonInfo(
    @SerializedName("name") val name: String,
    @SerializedName("height") val height: Int,
    @SerializedName("weight") val weight: Int,
    @SerializedName("base_experience") val experience: Int,
    @SerializedName("types") val types: List<Types>,
    @SerializedName("stats") val stats: List<Stats>,
    @SerializedName("sprites") val sprites: Sprites
) {

    data class Sprites(
        @SerializedName("back_default") val backDefault: String,
        @SerializedName("back_female") val backFemale: String,
        @SerializedName("back_shiny") val backShiny: String,
        @SerializedName("back_shiny_female") val backShinyFemale: String,
        @SerializedName("front_default") val frontDefault: String,
        @SerializedName("front_female") val frontfemale: String,
        @SerializedName("front_shiny") val frontShiny: String,
        @SerializedName("front_shiny_female") val frontShinyFemale: String
    )

    data class Types(val slot: Int, val type: Type) {
        data class Type(val name: String, val url: String)
    }

    data class Stats(@SerializedName("base_stat") val baseStat: Int, val stat: Stat) {
        data class Stat(val name: String, val url: String)
    }

    override fun toString(): String {
        return "NetWorkPokemonInfo(name='$name', height=$height, weight=$weight, experience=$experience, types=$types, stats=$stats, sprites=$sprites)"
    }
}
