package com.lepucare.xphealth.common.net.api

import com.lepucare.xphealth.common.data.bean.Translation
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @Class: ApiTranslationService
 * @Remark: 百度翻译接口
 */
interface ApiBaiDuTranslationService {

    /**
     * 百度翻译
     * @param translation 需要翻译的文本
     * @param original 源语言 (auto 自动识别)
     * @param target 目标语言
     * @param appId 翻译sdk的appId
     * @param salt 随机数
     * @param sign 签名 (规则: appId + q + salt + 密钥的MD5值)
     */
    @GET("api/trans/vip/translate?")
    suspend fun sendBaiDuTranslation(
        @Query("q") translation: String,
        @Query("from") original: String,
        @Query("to") target: String,
        @Query("appid") appId: String,
        @Query("salt") salt: String,
        @Query("sign") sign: String
    ): Translation

    companion object {
        private const val BASE_URL = "http://api.fanyi.baidu.com/"

        fun create(): ApiBaiDuTranslationService {
            val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }

            val client = OkHttpClient.Builder()
                    .addInterceptor(logger)
                    .build()

            return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ApiBaiDuTranslationService::class.java)
        }
    }
}