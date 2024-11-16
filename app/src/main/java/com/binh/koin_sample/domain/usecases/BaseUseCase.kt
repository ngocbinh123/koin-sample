package com.binh.koin_sample.domain.usecases

import kotlinx.coroutines.flow.Flow

interface BaseUseCase<I, O> {
    suspend fun execute(input: I): Flow<O>
}