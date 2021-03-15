package com.lepucare.xphealth.common.ui.base

import androidx.viewbinding.ViewBinding
import com.lepucare.xphealth.base.mvvm.v.BaseFrameNotMVVMFragment

/**
 * @Class: BaseNotMVVMFragment
 * @Remark: 不是 MVVM 模式的基类
 */
abstract class BaseNotMVVMFragment<VB : ViewBinding> : BaseFrameNotMVVMFragment<VB>()