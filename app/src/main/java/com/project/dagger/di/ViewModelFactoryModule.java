package com.project.dagger.di;

import com.project.dagger.viewmodel.ViewModelProviderFactory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule  {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);

    /*similar to provides
    @Provides
    static ViewModelProvider.Factory bindFactory(ViewModelProviderFactory factory){
        return factory;
    }
     */
}
