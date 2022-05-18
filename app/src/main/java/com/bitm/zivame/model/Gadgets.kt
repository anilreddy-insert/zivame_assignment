package com.bitm.zivame.model

import com.google.gson.annotations.SerializedName

data class Gadgets (
    @SerializedName("products") val products : List<Products>
){
    data class Products (
        @SerializedName("name") val name : String,
        @SerializedName("price") val price : Int,
        @SerializedName("image_url") val image_url : String,
        @SerializedName("rating") val rating : Int
    )
}