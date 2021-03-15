package com.lepucare.xphealth.base.mvvm.v

import androidx.viewbinding.ViewBinding

/**
 * @Class: FrameNotMVVMView
 * @Remark: View层基类抽象
 */
interface FrameNotMVVMView<VB : ViewBinding> {
    /**
     * 初始化View
     */
    fun VB.initView()

    /**
     * 初始化界面创建时的数据请求
     */
    fun initData()
}