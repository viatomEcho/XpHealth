package com.lepucare.xphealth.main.ui.main

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.alibaba.android.arouter.facade.annotation.Route
import com.lepucare.xphealth.common.constant.RouteUrl
import com.lepucare.xphealth.common.ui.base.BaseActivity
import com.lepucare.xphealth.main.R
import com.lepucare.xphealth.main.databinding.MainActivityMainBinding

@Route(path = RouteUrl.MainActivity)
class MainActivity : BaseActivity<MainActivityMainBinding, MainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val navController = this.findNavController(R.id.nav_host_fragment)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        mBinding.navView.setupWithNavController(navController)
    }

    override fun MainActivityMainBinding.initView() {

    }

    override fun subscribeUi() {
    }

    override fun initRequestData() {
    }

    override fun registerLiveEvent() {
    }
}