package com.lepucare.xphealth

import com.lepucare.xphealth.common.CommonApplication
import dagger.hilt.android.HiltAndroidApp


/**
 * @Class: AppApplication
 * @Remark: 壳App的Application 负责需要写在App包下的初始化逻辑
 */

@HiltAndroidApp
class AppApplication : CommonApplication() {

}