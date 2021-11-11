package com.example.simform_test.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Picture (

   @SerializedName("large") var large : String,
   @SerializedName("medium") var medium : String,
   @SerializedName("thumbnail") var thumbnail : String

): Parcelable