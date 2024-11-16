package com.binh.koin_sample.domain.repositories

import com.binh.koin_sample.domain.request.GetCurrentTripRequest

interface GetCurrentTripRepository {

    fun execute(input : GetCurrentTripRequest) : String
}