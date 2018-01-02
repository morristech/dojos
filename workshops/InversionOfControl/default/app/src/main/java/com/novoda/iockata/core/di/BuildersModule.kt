package com.novoda.iockata.core.di

import com.novoda.iockata.launcher.IoCLauncherActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector()
    abstract fun launcherActivity(): IoCLauncherActivity
}
