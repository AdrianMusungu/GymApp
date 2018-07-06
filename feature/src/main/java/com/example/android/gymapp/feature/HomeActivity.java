package com.example.android.gymapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void launchProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void launchRecord(View view) {
//        Intent intent = new Intent(this, RecordWorkoutsActivity.class);
//        startActivity(intent);
    }

    public void launchPastWorkouts(View view) {
        Intent intent = new Intent(this, PastWorkoutsActivity.class);
        startActivity(intent);
    }

    public void launchGymLocations(View view) {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void launchListGymInstructors(View view) {
        Intent intent = new Intent(this, GymInstructorsActivity.class);
        startActivity(intent);
    }
}
