package com.example.simform_test.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/example/simform_test/view/main/UsersViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/simform_test/repository/Repository;", "(Lcom/example/simform_test/repository/Repository;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", "", "_postData", "", "Lcom/example/simform_test/models/Example;", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "postData", "getPostData", "getRepository", "()Lcom/example/simform_test/repository/Repository;", "getUsers", "", "onError", "throwable", "app_debug"})
public final class UsersViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.simform_test.repository.Repository repository = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.simform_test.models.Example>> _postData;
    private androidx.lifecycle.MutableLiveData<java.lang.Throwable> _error;
    
    public UsersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.simform_test.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.simform_test.repository.Repository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.simform_test.models.Example>> getPostData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Throwable> getError() {
        return null;
    }
    
    public final void getUsers() {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
}