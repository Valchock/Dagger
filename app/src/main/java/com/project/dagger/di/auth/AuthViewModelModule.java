package com.project.dagger.di.auth;

import com.project.dagger.di.ViewModelKey;
import com.project.dagger.ui.AuthViewModel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {
   @Binds
   @IntoMap
   @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
