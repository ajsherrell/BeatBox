package com.ajsherrell.beatbox

import android.view.View
import android.widget.Button
import androidx.databinding.BindingAdapter

//examples from book:

@BindingAdapter("app:soundName")
fun bindAssetSound(button: Button, assetFileName: String) {
    //do stuff for a custom behaviour.
}

//for visibility on a view.
@BindingAdapter("app:isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) View.GONE else View.VISIBLE
}