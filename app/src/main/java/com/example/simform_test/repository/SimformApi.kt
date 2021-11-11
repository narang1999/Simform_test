package com.example.simform_test.repository

import com.example.simform_test.models.DataResponse
import com.example.simform_test.models.Example
import io.reactivex.Maybe
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface SimformApi {
    @GET("api/")
    fun getPostData(
        @Query("results") results: Int = 100,
        ): Maybe<DataResponse<List<Example>>>
}