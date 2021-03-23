package com.lepucare.xphealth.mine.data.remote

/**
 *  desc  : 处理成功或者失败的情况
 * @param out T
 */
sealed class PokemonResult<out T> {
    data class Success<out T>(val value: T) : PokemonResult<T>()

    data class Failure(val throwable: Throwable?) : PokemonResult<Nothing>()
}

inline fun <reified T> PokemonResult<T>.doSuccess(success: (T) -> Unit) {
    if (this is PokemonResult.Success) {
        success(value)
    }
}

inline fun <reified T> PokemonResult<T>.doFailure(failure: (Throwable?) -> Unit) {
    if (this is PokemonResult.Failure) {
        failure(throwable)
    }
}
