package com.example.simform_test.repository

import com.example.simform_test.models.DataResponse
import com.example.simform_test.models.Example
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class Repository(
    private val smartApi: SimformApi,
) : SimformApi {
    override fun getPostData(results:Int): Maybe<DataResponse<List<Example>>> =
        smartApi.getPostData()
            .subscribeOn(Schedulers.io())

}