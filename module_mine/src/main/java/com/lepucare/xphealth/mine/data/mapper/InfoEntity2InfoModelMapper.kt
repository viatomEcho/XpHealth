package com.lepucare.xphealth.mine.data.mapper

import com.lepucare.xphealth.mine.data.entity.PokemonInfoEntity
import com.lepucare.xphealth.mine.model.PokemonInfoModel

class InfoEntity2InfoModelMapper : Mapper<PokemonInfoEntity, PokemonInfoModel> {

    override fun map(input: PokemonInfoEntity): PokemonInfoModel {

        return convert2PokemonInfoEntity(input)
    }

    fun convert2PokemonInfoEntity(pokemonInfoModel: PokemonInfoEntity): PokemonInfoModel {
        return pokemonInfoModel.run {

            val dbTypes = mutableListOf<PokemonInfoModel.Type>()
            val dbStats = mutableListOf<PokemonInfoModel.Stats>()

            types.forEach {
                dbTypes.add(
                    PokemonInfoModel.Type(
                        name = it.name,
                        url = it.url
                    )
                )
            }

            stats.forEach {
                dbStats.add(
                    PokemonInfoModel.Stats(
                        baseStat = it.baseStat,
                        name = it.name,
                        url = it.url
                    )
                )
            }

            val albumsItem = mutableListOf<PokemonInfoModel.AlbumModel>()
            if (!sprites.backDefault.isEmpty()) {
                albumsItem.add(PokemonInfoModel.AlbumModel(index = 1, url = sprites.backDefault))
            }
            if (!sprites.backShiny.isEmpty()) {
                albumsItem.add(PokemonInfoModel.AlbumModel(index = 3, url = sprites.backShiny))
            }
            if (!sprites.frontDefault.isEmpty()) {
                albumsItem.add(PokemonInfoModel.AlbumModel(index = 5, url = sprites.frontDefault))
            }
            if (!sprites.frontShiny.isEmpty()) {
                albumsItem.add(PokemonInfoModel.AlbumModel(index = 7, url = sprites.frontShiny))
            }

            PokemonInfoModel(
                name = name,
                height = height,
                weight = weight,
                experience = experience,
                types = dbTypes,
                stats = dbStats,
                albums = albumsItem
            )
        }
    }

}