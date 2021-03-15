package com.lepucare.xphealth.common.ui.base

import androidx.viewbinding.ViewBinding
import com.lepucare.xphealth.base.mvvm.v.BaseFrameNotMVVMActivity

/**
 * @Class: BaseNotMVVMActivity
 * @Remark: 不是 MVVM 模式的基类
 */
abstract class BaseNotMVVMActivity<VB : ViewBinding> : BaseFrameNotMVVMActivity<VB>()