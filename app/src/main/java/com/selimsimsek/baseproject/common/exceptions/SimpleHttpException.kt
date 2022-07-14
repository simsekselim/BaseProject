package com.selimsimsek.baseproject.common.exceptions

data class SimpleHttpException(
    val code: String?,
    val friendlyMessage: String?
) : Exception()