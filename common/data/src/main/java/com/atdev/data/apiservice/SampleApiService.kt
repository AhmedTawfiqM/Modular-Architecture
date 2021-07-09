package com.atdev.data.apiservice

import retrofit2.http.GET

interface SampleApiService {

    @GET("")
    suspend fun getData()
}