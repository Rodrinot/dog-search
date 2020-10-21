package com.example.android.retrofitsample

import android.widget.ImageView
import com.squareup.picasso.Picasso

class ImageExtensions {

    fun ImageView.fromUrl(url: String) {
        Picasso.get().load(url).into(this)
    }

}