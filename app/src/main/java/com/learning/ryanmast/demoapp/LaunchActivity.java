package com.learning.ryanmast.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    // Launch Hello World activity
    public void launchHelloWorld(View view) {
        Intent intent = new Intent(this, HelloWorld.class);
        startActivity(intent);
    }
}
