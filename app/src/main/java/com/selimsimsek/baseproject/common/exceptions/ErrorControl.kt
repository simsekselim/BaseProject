package com.selimsimsek.baseproject.common.exceptions

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ErrorControl(
    val code: String,
    val error: String
) : Parcelable