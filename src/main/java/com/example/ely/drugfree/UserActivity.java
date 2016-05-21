package com.example.ely.drugfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.TestMethod;
import android.widget.EditText;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
    }
}
