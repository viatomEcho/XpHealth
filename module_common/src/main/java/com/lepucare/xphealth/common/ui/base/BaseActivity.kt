package com.lepucare.xphealth.common.ui.base

import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.lepucare.xphealth.base.mvvm.v.BaseFrameActivity

/**
 * @Class: BaseActivity
 * @Remark: 项目相关的Activity基类
 */
abstract class BaseActivity<VB : ViewBinding, VM : ViewModel> : BaseFrameActivity<VB, VM>()