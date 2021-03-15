package com.lepucare.xphealth.common.ui.base

import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.lepucare.xphealth.base.mvvm.v.BaseFrameFragment

/**
 * @Class: BaseFragment
 * @Remark: 项目相关的Fragment基类
 */
abstract class BaseFragment<VB : ViewBinding, VM : ViewModel> : BaseFrameFragment<VB, VM>()