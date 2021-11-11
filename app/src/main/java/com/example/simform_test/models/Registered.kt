package com.example.simform_test.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Registered (

   @SerializedName("date") var date : String,
   @SerializedName("age") var age : Int

): Parcelable