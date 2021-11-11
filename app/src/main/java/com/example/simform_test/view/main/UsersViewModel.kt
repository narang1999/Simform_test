package com.example.simform_test.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simform_test.di.launch
import com.example.simform_test.models.Example
import com.example.simform_test.repository.Repository
import io.reactivex.android.schedulers.AndroidSchedulers

class UsersViewModel(val repository: Repository) : ViewModel() {
    val postData: LiveData<List<Example>> get() = _postData
    private var _postData: MutableLiveData<List<Example>> = MutableLiveData<List<Example>>()
    val error: LiveData<Throwable> get() = _error
    private var _error: MutableLiveData<Throwable> = MutableLiveData<Throwable>()

    init {
        getUsers()
    }

     fun getUsers() {
        launch {
            repository.getPostData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ _postData.value = it.results!! }, this::onError)
        }
    }

    private fun onError(throwable: Throwable) {
        _error.postValue(throwable)
    }
}