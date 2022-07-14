package com.selimsimsek.baseproject.presentation.splash

import com.selimsimsek.baseproject.R
import com.selimsimsek.baseproject.base.BaseFragment
import com.selimsimsek.baseproject.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : BaseFragment<SplashViewModel, FragmentSplashBinding>(
    R.layout.fragment_splash,
    SplashViewModel::class.java
)