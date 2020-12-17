package com.project.dagger.di;

import com.project.dagger.di.auth.AuthModule;
import com.project.dagger.di.auth.AuthViewModelModule;
import com.project.dagger.ui.AuthActivity;
import com.project.dagger.ui.AuthViewModel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModelModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();
}
