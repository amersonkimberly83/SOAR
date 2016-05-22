package com.example.ely.drugfree;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Ben use this page to make a confirmation on the panic.
public class ConfirmPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_page);

        final Button bConfirm = (Button) findViewById(R.id.bConfirm);
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);


        final EditText etPEmergencyContact = (EditText) findViewById(R.id.etPEmergencyContact);

        SharedPreferences sp = getSharedPreferences("profileInfo", 0);
        etPEmergencyContact.getEditableText().append(sp.getString("emergencyContact", ""));

        bConfirm.setOnClickListener(new View.OnClickListener()   {

            @Override
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences("profileInfo", 0);

                SmsManager sm = SmsManager.getDefault();

                String phoneNumber = sp.getString("emergencyContact", "");
                String message = sp.getString("emergencyMsg", "");
                sm.sendTextMessage(phoneNumber, null, message, null, null);

                Intent confirmIntent = new Intent(ConfirmPage.this, MainActivity.class);
                ConfirmPage.this.startActivity(confirmIntent);


                //etTestinfo.getEditableText().clear();
                //etTestinfo.getEditableText().append(sp.getString("emergencyContact", ""));


            }
        });






    }
}
