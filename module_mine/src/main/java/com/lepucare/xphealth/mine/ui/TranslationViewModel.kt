package com.lepucare.xphealth.mine.ui

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lepucare.xphealth.base.utils.LogUtils
import com.lepucare.xphealth.common.data.repository.TranslationRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.*

class TranslationViewModel @ViewModelInject internal constructor(
   private val translationRepository: TranslationRepository
): ViewModel() {

//    fun insertUser(translation: Translation) {
//        viewModelScope.launch {
//            translationRepository.insertTranslation(translation)
//        }
//    }

   /**
    * 请求翻译
    * @param original 需要翻译的文本
    */
   fun requestTranslation(original: String) {
      viewModelScope.launch(Dispatchers.IO) {
         translationRepository.getTranslation(original)
            .onStart {
               // 请求开始之前的操作
               Log.d("getTranslation", "onStart")
            }
            .catch {
               // 捕获并处理上游抛出的异常
               Log.d("getTranslation", "error")

            }
            .onCompletion {
               // 已完成
               Log.d("getTranslation", "onCompletion")

            }
            .collect{

               Log.d("getTranslation", it)


            }
      }
   }


}


