package com.lepucare.xphealth.mine.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.lepucare.xphealth.mine.data.entity.PokemonEntity
import com.lepucare.xphealth.mine.data.entity.PokemonInfoEntity
import com.lepucare.xphealth.mine.data.local.AppDataBase
import com.lepucare.xphealth.mine.data.mapper.Mapper
import com.lepucare.xphealth.mine.data.remote.PokemonResult
import com.lepucare.xphealth.mine.data.remote.PokemonService
import com.lepucare.xphealth.mine.model.PokemonInfoModel
import com.lepucare.xphealth.mine.model.PokemonItemModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map

/**
 * Repository的具体实现
 * @property api PokemonService
 * @property db AppDataBase
 * @property pageConfig PagingConfig
 * @property mapper2ItemMolde Mapper<PokemonEntity, PokemonItemModel>
 * @property mapper2InfoModel Mapper<PokemonInfoEntity, PokemonInfoModel>
 * @constructor
 */
class PokemonRepositoryImpl(
    val api: PokemonService,
    val db: AppDataBase,
    val pageConfig: PagingConfig,
    val mapper2ItemMolde: Mapper<PokemonEntity, PokemonItemModel>,
    val mapper2InfoModel: Mapper<PokemonInfoEntity, PokemonInfoModel>
) : Repository {

    override fun fetchPokemonList(): Flow<PagingData<PokemonItemModel>> {
        //Pager 实例来设置分页数据流
//        您不能直接传递 PagingSource 构造函数，而必须提供从 DAO 返回 PagingSource 对象的查询方法。
//        您必须提供 RemoteMediator 实现的实例作为 remoteMediator 参数。
        return Pager(
            config = pageConfig,
            remoteMediator = PokemonRemoteMediator(api, db)
        ) {
            //返回PagingSource包裹的数据
            db.pokemonDao().getPokemon()
        }.flow.map { pagingData ->
            //将entity转成展示页面的model
            pagingData.map { mapper2ItemMolde.map(it) }
        }
    }

    override suspend fun fetchPokemonInfo(name: String): Flow<PokemonResult<PokemonInfoModel>> {
        return flow {
            try {
                val pokemonDao = db.pokemonInfoDao()
                // 查询数据库是否存在，如果不存在请求网络
                var infoModel = pokemonDao.getPokemon(name)
                if (infoModel == null) {
                    // 网络请求
                    val netWorkPokemonInfo = api.fetchPokemonInfo(name)

                    // 将网路请求的数据，换转成的数据库的 model，之后插入数据库
                    infoModel = PokemonInfoEntity.convert2PokemonInfoEntity(netWorkPokemonInfo)
                    // 插入更新数据库
                    pokemonDao.insertPokemon(infoModel)
                }
                // 将数据源的 model 转换成上层用到的 model，
                // ui 不能直接持有数据源，防止数据源的变化，影响上层的 ui
                val model = mapper2InfoModel.map(infoModel)

                // 发射转换后的数据
                emit(PokemonResult.Success(model))
            } catch (e: Exception) {
                emit(PokemonResult.Failure(e.cause))
            }
        }.flowOn(Dispatchers.IO) // 通过 flowOn 切换到 io 线程
    }

    override suspend fun fetchPokemonByParameter(parameter: String): Flow<PagingData<PokemonItemModel>> {
        return Pager(pageConfig) {
            // 加载数据库的数据
            db.pokemonDao().pokemonInfoByParameter(parameter)
        }.flow.map { pagingData ->

            // 数据映射，数据库实体 PersonEntity ——>  上层用到的实体 Person
            pagingData.map { mapper2ItemMolde.map(it) }
        }
    }


    companion object {
        private val TAG = "PokemonRepositoryImpl"
    }
}