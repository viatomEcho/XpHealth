package com.lepucare.xphealth.mine.data.mapper

import com.lepucare.xphealth.mine.data.entity.PokemonEntity
import com.lepucare.xphealth.mine.model.PokemonItemModel

/**
 * 将源数据转成页面展示的model数据
 */
class Entity2ItemModelMapper : Mapper<PokemonEntity, PokemonItemModel> {

    override fun map(input: PokemonEntity): PokemonItemModel =
        PokemonItemModel(name = input.name, url = input.url)

}