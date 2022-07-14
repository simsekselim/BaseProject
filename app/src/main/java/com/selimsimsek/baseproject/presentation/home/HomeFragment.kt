package com.selimsimsek.baseproject.presentation.home

import com.selimsimsek.baseproject.R
import com.selimsimsek.baseproject.base.BaseFragment
import com.selimsimsek.baseproject.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(
    R.layout.fragment_home,
    HomeViewModel::class.java
)