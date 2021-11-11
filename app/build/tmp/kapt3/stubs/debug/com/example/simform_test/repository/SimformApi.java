package com.example.simform_test.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/simform_test/repository/SimformApi;", "", "getPostData", "Lio/reactivex/Maybe;", "Lcom/example/simform_test/models/DataResponse;", "", "Lcom/example/simform_test/models/Example;", "results", "", "app_debug"})
public abstract interface SimformApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/")
    public abstract io.reactivex.Maybe<com.example.simform_test.models.DataResponse<java.util.List<com.example.simform_test.models.Example>>> getPostData(@retrofit2.http.Query(value = "results")
    int results);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}