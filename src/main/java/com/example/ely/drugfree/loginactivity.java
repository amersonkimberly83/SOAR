package com.example.ely.drugfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        // I am making perminiat names for the login activity page page
        // editable text fuctions
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);

        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final Button bToRegister = (Button) findViewById(R.id.bToRegister);

        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);


        // What this does is send you to the main activity when you click the login button
        // the first line of code has the app wait for the user to press the button and start running functions.
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(loginactivity.this, MainActivity.class);
                loginactivity.this.startActivity(loginIntent);

            }
        });

        // what this does is send you to the registration page of the app
        bToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(loginactivity.this, RegisterActivity.class);
                loginactivity.this.startActivity(loginIntent);

            }
        });

    }
}
