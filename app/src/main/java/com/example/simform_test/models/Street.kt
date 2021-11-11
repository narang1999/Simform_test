package com.example.simform_test.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Street (

   @SerializedName("number") var number : Int,
   @SerializedName("name") var name : String

): Parcelable