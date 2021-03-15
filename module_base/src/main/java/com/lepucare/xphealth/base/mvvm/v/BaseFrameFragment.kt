package com.lepucare.xphealth.base.mvvm.v

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.alibaba.android.arouter.launcher.ARouter
import com.quyunshuo.base.utils.BindingReflex
import com.quyunshuo.base.mvvm.v.FrameView

/**
 * @Class: BaseFrameFragment
 * @Remark: Fragment基类 与项目无关
 */
abstract class BaseFrameFragment<VB : ViewBinding, VM : ViewModel> : Fragment(), FrameView<VB> {

    protected val mBinding: VB by lazy(mode = LazyThreadSafetyMode.NONE) {
        BindingReflex.reflexViewBinding(javaClass, layoutInflater)
    }

    protected val mViewModel: VM by lazy(mode = LazyThreadSafetyMode.NONE) {
        BindingReflex.reflexViewModel(javaClass, this)
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
        initLiveDataObserve()
        initData()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}