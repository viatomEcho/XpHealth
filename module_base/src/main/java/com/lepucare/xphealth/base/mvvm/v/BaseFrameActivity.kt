package com.lepucare.xphealth.base.mvvm.v

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.alibaba.android.arouter.launcher.ARouter
import com.quyunshuo.base.mvvm.v.FrameView
import com.lepucare.xphealth.base.utils.BindingReflex

/**
 * @Class: BaseFrameActivity
 * @Remark: Activity基类 与项目无关
 */
abstract class BaseFrameActivity<VB : ViewBinding, VM : ViewModel> :
    AppCompatActivity(), FrameView<VB> {

    protected val mBinding: VB by lazy(mode = LazyThreadSafetyMode.NONE) {
        BindingReflex.reflexViewBinding(javaClass, layoutInflater)
    }

    protected val mViewModel: VM by lazy(mode = LazyThreadSafetyMode.NONE) {
        BindingReflex.reflexViewModel(javaClass, this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
        // ARouter 依赖注入
        ARouter.getInstance().inject(this)
        mBinding.initView()
        subscribeUi()
        registerLiveEvent()
        initRequestData()

    }



}