package com.example.simform_test.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Location (

   @SerializedName("street") var street : Street,
   @SerializedName("city") var city : String,
   @SerializedName("state") var state : String,
   @SerializedName("country") var country : String,
   @SerializedName("postcode") var postcode : String,
   @SerializedName("coordinates") var coordinates : Coordinates,
   @SerializedName("timezone") var timezone : Timezone

): Parcelable