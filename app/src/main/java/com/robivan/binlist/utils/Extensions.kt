package com.robivan.binlist.utils

import android.view.View

fun View.show(): View {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
    return this
}

fun View.hide(): View {
    if (visibility != View.GONE) {
        visibility = View.GONE
    }
    return this
}

fun validateUrl(url: String): String =
    if (!url.startsWith("https://") || !url.startsWith("http://")) {
        "http://$url"
    } else {
        url
    }