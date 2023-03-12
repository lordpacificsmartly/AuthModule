package com.lordpacific.loginauthmodule.di

import com.lordpacific.loginauthmodule.data.AuthRepositoryImpl
import com.lordpacific.loginauthmodule.domain.repository.AuthRepository
import com.lordpacific.loginauthmodule.domain.usecase.ValidateLoginInputUseCase
import com.lordpacific.loginauthmodule.domain.usecase.ValidateRegisterInputUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideValidateLoginInputUseCase(): ValidateLoginInputUseCase {
        return ValidateLoginInputUseCase()
    }

    @Provides
    @Singleton
    fun provideValidateRegisterInputUseCase(): ValidateRegisterInputUseCase {
        return ValidateRegisterInputUseCase()
    }

    @Provides
    @Singleton
    fun provideAuthRepository(): AuthRepository {
        return AuthRepositoryImpl()
    }

}