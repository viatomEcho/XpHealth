package com.lepucare.xphealth.mine.ui

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.lepucare.xphealth.common.constant.RouteUrl
import com.lepucare.xphealth.common.ui.base.BaseActivity
import com.lepucare.xphealth.mine.databinding.MineTranslationBinding

@Route(path = RouteUrl.TranslationActivity)
class TranslationActivity : BaseActivity<MineTranslationBinding, TranslationViewModel>(){



    override fun MineTranslationBinding.initView() {
        mBinding.translate.setOnClickListener {
            mViewModel.requestTranslation(mBinding.edit.text.toString())
        }

    }

    override fun subscribeUi() {

    }

    override fun initRequestData() {

    }

    override fun registerLiveEvent() {
    }


}