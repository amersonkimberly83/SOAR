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
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is a test

        final Button bPanic = (Button) findViewById(R.id.bPanic);
        final EditText etTestinfo = (EditText) findViewById(R.id.etTestinfo);
        final Button bResources = (Button) findViewById(R.id.bResources);
        final Button bChat = (Button) findViewById(R.id.bChat);
        final Button bFind = (Button) findViewById(R.id.bFind);
        //ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);

        bPanic.setOnClickListener(new View.OnClickListener()   {

            @Override
            public void onClick(View v) {

                Intent panicIntent = new Intent(MainActivity.this, ConfirmPage.class);
                MainActivity.this.startActivity(panicIntent);



                /*
                SharedPreferences sp = getSharedPreferences("profileInfo", 0);

                SmsManager sm = SmsManager.getDefault();

                String phoneNumber = sp.getString("emergencyContact", "");
                String message = sp.getString("emergencyMsg", "");
                sm.sendTextMessage(phoneNumber, null, message, null, null);
                */
                //etTestinfo.getEditableText().clear();
                //etTestinfo.getEditableText().append(sp.getString("emergencyContact", ""));


            }
        });

        bResources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resourceIntent = new Intent(MainActivity.this, ResourceActivity.class);
                MainActivity.this.startActivity(resourceIntent);

            }
        });


        bFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent findIntent = new Intent(MainActivity.this, Find.class);
                MainActivity.this.startActivity(findIntent);

            }
        });


        bChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatIntent = new Intent(MainActivity.this, Chat.class);
                MainActivity.this.startActivity(chatIntent);

            }
        });

    }
}
