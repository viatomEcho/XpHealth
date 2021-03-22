package com.lepucare.xphealth.base.mvvm.v

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.alibaba.android.arouter.launcher.ARouter
import com.lepucare.xphealth.base.utils.BindingReflex

/**
 * @Class: BaseFrameNotMVVMFragment
 * @Remark: 不使用 MVVM 的 Fragment 基类
 */
abstract class BaseFrameNotMVVMFragment<VB : ViewBinding> : Fragment(), FrameNotMVVMView<VB> {

    protected val mBinding: VB by lazy(mode = LazyThreadSafetyMode.NONE) {
        BindingReflex.reflexViewBinding(javaClass, layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // ARouter 依赖注入
        ARouter.getInstance().inject(this)
        mBinding.initView()
        registerLiveEvent()
        initRequestData()
    }
}