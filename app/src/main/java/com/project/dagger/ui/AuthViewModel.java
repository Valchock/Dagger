package com.project.dagger.ui;

import android.util.Log;

import com.project.dagger.network.auth.AuthApi;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";
    private final AuthApi authApi;
    @Inject
    public AuthViewModel(AuthApi authApi) {
        Log.d(TAG, "ViewModel working");
        this.authApi = authApi;
        if(this.authApi == null){
            Log.d(TAG, "authapi is null");
        }else{
            Log.d(TAG, "authapi is not null");
        }
    }
}
