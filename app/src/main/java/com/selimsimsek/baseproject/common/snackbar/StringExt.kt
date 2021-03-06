package com.selimsimsek.baseproject.common.snackbar

import android.widget.Toast
import androidx.fragment.app.Fragment


fun Fragment.snackbar(message: String) {
    this.let {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }
}