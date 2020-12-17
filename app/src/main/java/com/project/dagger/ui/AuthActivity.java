package com.project.dagger.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.project.dagger.R;
import com.project.dagger.viewmodel.ViewModelProviderFactory;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {


    private static final String TAG = "AuthActivity";
    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.user_id)
    EditText userId;
    @BindView(R.id.login_btn)
    Button loginBtn;
    private AuthViewModel authViewModel;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Inject
    Drawable logo;

    @Inject
    RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        ButterKnife.bind(this);
        authViewModel = ViewModelProviders.of(this, providerFactory).get(AuthViewModel.class);
        setLogo();
    }

    private void setLogo() {
        requestManager
                .load(logo)
                .into(img);
    }
}
