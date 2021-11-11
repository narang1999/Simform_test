package com.example.simform_test.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/simform_test/repository/Repository;", "Lcom/example/simform_test/repository/SimformApi;", "smartApi", "(Lcom/example/simform_test/repository/SimformApi;)V", "getPostData", "Lio/reactivex/Maybe;", "Lcom/example/simform_test/models/DataResponse;", "", "Lcom/example/simform_test/models/Example;", "results", "", "app_debug"})
public final class Repository implements com.example.simform_test.repository.SimformApi {
    private final com.example.simform_test.repository.SimformApi smartApi = null;
    
    public Repository(@org.jetbrains.annotations.NotNull()
    com.example.simform_test.repository.SimformApi smartApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Maybe<com.example.simform_test.models.DataResponse<java.util.List<com.example.simform_test.models.Example>>> getPostData(int results) {
        return null;
    }
}