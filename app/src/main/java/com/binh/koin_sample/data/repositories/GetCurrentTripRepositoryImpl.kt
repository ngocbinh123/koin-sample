package com.binh.koin_sample.data.repositories

import com.binh.koin_sample.domain.repositories.GetCurrentTripRepository
import com.binh.koin_sample.domain.request.GetCurrentTripRequest

// extend from GetCurrentTripRepository and return empty string
class GetCurrentTripRepositoryImpl : GetCurrentTripRepository {
    override fun execute(input: GetCurrentTripRequest): String {
        return "success"
    }
}
