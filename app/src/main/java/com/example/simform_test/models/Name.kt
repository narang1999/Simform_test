package com.example.simform_test.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Name (
   @SerializedName("title") var title : String,
   @SerializedName("first") var first : String,
   @SerializedName("last") var last : String

): Parcelable