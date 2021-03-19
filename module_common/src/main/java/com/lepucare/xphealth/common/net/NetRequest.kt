package com.lepucare.xphealth.common.net

import com.lepucare.xphealth.common.net.api.ApiBaiDuTranslationService
import com.lepucare.xphealth.common.net.api.ApiCommonService

/**
 * @Class: NetRequest
 * @Remark: 对ApiService动态代理对象统一管理
 */
object NetRequest {

    // 公共接口
    val commonService by lazy(mode = LazyThreadSafetyMode.NONE) {
        NetServiceCreator.create(ApiCommonService::class.java)
    }

    //
    val mineService by lazy(mode = LazyThreadSafetyMode.NONE) {
        NetServiceCreator.create(ApiBaiDuTranslationService::class.java)
    }

}