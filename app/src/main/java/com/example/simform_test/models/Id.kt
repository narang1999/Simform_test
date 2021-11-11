package com.example.simform_test.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Id (

   @SerializedName("name") var name : String,
   @SerializedName("value") var value : String

): Parcelable