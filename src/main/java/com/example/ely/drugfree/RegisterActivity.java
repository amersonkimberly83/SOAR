package com.example.ely.drugfree;

import android.content.Intent;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // I am making perminiat names for the activity register page
        // editable text fuctions
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etEmergencyContact = (EditText) findViewById(R.id.etEmergencyContact);
        final EditText etBio = (EditText) findViewById(R.id.etBio);
        // Spinner functions
        final Spinner sUsertype = (Spinner) findViewById(R.id.sUsertype);
        //Buttons
        final Button bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(RegisterActivity.this, loginactivity.class);
                RegisterActivity.this.startActivity(registerIntent);
            }
        });


    }
}
