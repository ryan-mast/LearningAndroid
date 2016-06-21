package com.learning.ryanmast.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class HelloWorld extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.learning.ryanmast.demoapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }

    // Called when the user clicks the Send button
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayHelloWorldActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
