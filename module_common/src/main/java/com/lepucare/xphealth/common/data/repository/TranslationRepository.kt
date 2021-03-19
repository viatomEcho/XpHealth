package com.lepucare.xphealth.common.data.repository

import com.lepucare.xphealth.base.mvvm.m.BaseRepository
import com.lepucare.xphealth.common.constant.translationAppId
import com.lepucare.xphealth.common.constant.translationSecurityKry
import com.lepucare.xphealth.common.data.bean.Translation
import com.lepucare.xphealth.common.data.dao.TranslationDao
import com.lepucare.xphealth.common.net.NetRequest
import com.lepucare.xphealth.common.utlis.MD5
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TranslationRepository @Inject constructor(private val translationDao: TranslationDao) : BaseRepository(){
     //Database
//     suspend fun insertTranslation(translation: Translation) = translationDao.insertTranslation(translation)

     fun insertTranslation(translation: Translation) = flowRequest<String> {
          translationDao.insertTranslation(translation)
     }

     fun loadAll() = translationDao.loadAll()


     //Net
     /**
      * 获取翻译结果
      * @param original 需要翻译的文本
      */
     fun getTranslation(original: String) =
             flowRequest<String> {
                  // 以当前时间做为随机数
                  val sign = System.currentTimeMillis().toString()
                  // 发起请求
                  val response = NetRequest.mineService.sendBaiDuTranslation(
                          original,
                          "auto",
                          "en",
                          translationAppId,
                          sign,
                          MD5.encode("${translationAppId}${original}${sign}${translationSecurityKry}")
                  )
                  // 将翻译结果发射出去
                  emit(response.trans_result[0].dst)
             }


}