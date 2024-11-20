package com.binh.koin_sample.domain.usecases

import com.binh.koin_sample.domain.repositories.GetCurrentTripRepository
import com.binh.koin_sample.domain.request.GetCurrentTripRequest
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

typealias GetCurrentTripUseCase = BaseUseCase<GetCurrentTripRequest, String>

class GetCurrentTripUseCaseImpl(
    private val repository: GetCurrentTripRepository
) : GetCurrentTripUseCase {
    override suspend fun execute(input: GetCurrentTripRequest): Flow<String> {
        return flow<String> {
            val result = repository.execute(input)
            delay(1000)
            emit(result)
        }
    }
}