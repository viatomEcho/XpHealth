package com.quyunshuo.base.mvvm.v

import androidx.viewbinding.ViewBinding

/**
 * @Class: FrameView
 * @Remark: View层基类抽象
 */
interface FrameView<VB : ViewBinding> {

    /**
     * 初始化View
     */
    fun VB.initView()

    /**
     * 初始化LiveData的订阅关系
     */
    fun subscribeUi()

    /**
     * 初始化界面创建时的数据请求
     */
    fun initRequestData()

    /**
     * 注册LiveEvent
     */
    fun  registerLiveEvent()
}