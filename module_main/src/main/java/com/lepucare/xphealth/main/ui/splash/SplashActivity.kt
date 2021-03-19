package com.lepucare.xphealth.main.ui.splash

import androidx.lifecycle.lifecycleScope
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.lepucare.xphealth.common.constant.RouteUrl
import com.lepucare.xphealth.common.ui.base.BaseActivity
import com.lepucare.xphealth.main.databinding.MainActivitySplashBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import me.jessyan.autosize.internal.CancelAdapt

/**
 * @Class:
 * @Remark:
 */
@Route(path = RouteUrl.SplashActivity)
class SplashActivity : BaseActivity<MainActivitySplashBinding, SplashViewModel>(), CancelAdapt {

    override fun MainActivitySplashBinding.initView() {
        jumpMain()
    }

    /**
     * 延时跳转到首页
     */
    private fun jumpMain() {
        lifecycleScope.launch(Dispatchers.Default) {
            delay(1000L)
            ARouter.getInstance()
                .build(RouteUrl.MainActivity)
                .navigation()
            delay(100L)
            finish()
        }
    }

    override fun subscribeUi() {}

    override fun initRequestData() {
    }

    override fun registerLiveEvent() {
    }
}