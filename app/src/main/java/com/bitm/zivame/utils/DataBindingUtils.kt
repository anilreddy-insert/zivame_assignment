package com.bitm.zivame.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("android:loadImage")
fun loadImage(view: ImageView, imageUrl: String) {
    Glide.with(view.context).load(imageUrl).into(view)
}