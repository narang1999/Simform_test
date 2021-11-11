package com.example.simform_test.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Timezone (

   @SerializedName("offset") var offset : String,
   @SerializedName("description") var description : String

): Parcelable