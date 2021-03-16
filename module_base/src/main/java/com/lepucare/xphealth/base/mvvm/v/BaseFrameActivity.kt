package com.lepucare.xphealth.base.mvvm.v

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.alibaba.android.arouter.launcher.ARouter
import com.lepucare.xphealth.base.BaseApplication.Companion.context
import com.quyunshuo.base.mvvm.v.FrameView
import com.quyunshuo.base.utils.BindingReflex
import kotlinx.coroutines.launch

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
        initLiveDataObserve()
        initData()

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}