package com.learning.ryanmast.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayHelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_hello_world);

        // Get the message to show from the Intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(HelloWorld.EXTRA_MESSAGE);

        // Create a new TextView to show the message
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Hello " + message);

        // Add the text view to the layout to show it
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);
    }
}
