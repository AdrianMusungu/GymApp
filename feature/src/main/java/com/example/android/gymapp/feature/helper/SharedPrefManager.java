package com.example.android.gymapp.feature.helper;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.android.gymapp.feature.models.User;

public class SharedPrefManager {
    private static SharedPrefManager mInstance;
    private static Context mCtx;

    private static final String SHARED_PREF_NAME = "MySharedPrefRetrofit";

    private static final String KEY_USER_ID = "keyuserid";
    private static final String KEY_USER_FNAME = "keyuserfirstname";
    private static final String KEY_USER_LNAME = "keyuserlastname";
    private static final String KEY_USER_EMAIL = "keyuseremail";


    private SharedPrefManager(Context context) {
        mCtx = context;
    }

    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPrefManager(context);
        }
        return mInstance;
    }

    public boolean userLogin(User user) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY_USER_ID, user.getId());
        editor.putString(KEY_USER_FNAME, user.getFirstName());
        editor.putString(KEY_USER_LNAME, user.getLastName());
        editor.putString(KEY_USER_EMAIL, user.getEmail());

        editor.apply();
        return true;
    }

    public boolean isLoggedIn() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        if (sharedPreferences.getString(KEY_USER_EMAIL, null) != null)
            return true;
        return false;
    }

    public User getUser() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new User(
                sharedPreferences.getInt(KEY_USER_ID, 0),
                sharedPreferences.getString(KEY_USER_FNAME, null),
                sharedPreferences.getString(KEY_USER_LNAME, null),
                sharedPreferences.getString(KEY_USER_EMAIL, null)

        );
    }

    public boolean logout() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        return true;
    }
}
