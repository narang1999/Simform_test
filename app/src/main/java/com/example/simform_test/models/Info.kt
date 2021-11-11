package com.example.simform_test.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Info(
    val seed:String,
    val results:Int,
    val page:Int,
    val version:String,
): Parcelable
