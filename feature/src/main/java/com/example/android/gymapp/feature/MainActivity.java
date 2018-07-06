package com.example.android.gymapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.gymapp.feature.R;
import com.example.android.gymapp.feature.api.APIService;
import com.example.android.gymapp.feature.models.Result;
import com.example.android.gymapp.feature.models.User;
import com.example.android.gymapp.feature.helper.SharedPrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {   //implements View.OnClickListener

    private Button buttonSignIn, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSignIn = (Button) findViewById(R.id.buttonSignIn);
        buttonSignUp = (Button) findViewById(R.id.buttonSignUp);

        //if user is already logged in opening the home activity
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, HomeActivity.class));
        }

//        buttonSignIn.setOnClickListener(this);
//        buttonSignUp.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//
//        if (view == buttonSignIn) {
//
//            startActivity(new Intent(this, SignInActivity.class));
//
//        } else if (view == buttonSignUp) {
//
//            startActivity(new Intent(this, SignUpActivity.class));
//
//        }
//    }

    public void launchSignUpPage(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void launchSignInPage(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}
