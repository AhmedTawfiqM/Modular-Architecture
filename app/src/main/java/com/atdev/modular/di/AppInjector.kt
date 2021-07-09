package com.atdev.modular_architecture.di

import android.app.Application
import com.atdev.data.di.injectDataModule
import com.atdev.modular.di.modules.injectAppModule
import com.atdev.modular.di.modules.injectPresentationModule

object AppInjector {

    fun inject(app: Application) {
        //todo start your Dependency Injection
        injectAppModule()
        injectDataModule()
        injectPresentationModule()
    }
}