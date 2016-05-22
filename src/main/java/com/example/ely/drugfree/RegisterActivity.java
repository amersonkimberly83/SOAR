package com.example.ely.drugfree;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class RegisterActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

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
        final EditText etEmergencyMsg = (EditText) findViewById(R.id.etEmergencyMsg);

        final Switch switchUser = (Switch) findViewById(R.id.switchUser);
        final Switch switchSupport = (Switch) findViewById(R.id.switchSupporter);


        // Spinner functions
        //final Spinner sUsertype = (Spinner) findViewById(R.id.sUsertyp);
        //Buttons
        final Button bRegister = (Button) findViewById(R.id.bRegister);

        //final TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        //final String countryCode = tm.getSimCountryIso();
        etEmergencyContact.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

        // this confirms that the user has made a profile and sends them to the login page.
        assert bRegister != null;
        bRegister.setOnClickListener(new View.OnClickListener() {



            /*
            put save emergency contact information here.

             */


            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                //this uses newer format number syntax, and thus requires at least API 21
                String password = etPassword.getText().toString();
                String email = etEmail.getText().toString();
                String emergencyContact = PhoneNumberUtils.formatNumber(etEmergencyContact.getText().toString());
                String bio = etBio.getText().toString();
                String emergencyMsg = etEmergencyMsg.getText().toString();



                SharedPreferences sp = getSharedPreferences("profileInfo", 0);
                sp.edit().putString("username", username).putString("password", password).
                        putString("email", email).putString("emergencyContact", emergencyContact).
                        putString("bio", bio).putString("emergencyMsg", emergencyMsg).apply();


                Intent registerIntent = new Intent(RegisterActivity.this, loginactivity.class);
                RegisterActivity.this.startActivity(registerIntent);
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Register Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.ely.drugfree/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Register Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.ely.drugfree/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
