package com.example.simform_test.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Login (

   @SerializedName("uuid") var uuid : String,
   @SerializedName("username") var username : String,
   @SerializedName("password") var password : String,
   @SerializedName("salt") var salt : String,
   @SerializedName("md5") var md5 : String,
   @SerializedName("sha1") var sha1 : String,
   @SerializedName("sha256") var sha256 : String

): Parcelable