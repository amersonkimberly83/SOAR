package com.example.ely.drugfree;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button bPanic = (Button) findViewById(R.id.bPanic);
        final EditText etTestinfo = (EditText) findViewById(R.id.etTestinfo);
        final Button bResources = (Button) findViewById(R.id.bResources);
        final Button bChat = (Button) findViewById(R.id.bChat);
        final Button bFind = (Button) findViewById(R.id.bFind);


        bPanic.setOnClickListener(new View.OnClickListener()   {

            @Override
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences("profileInfo", 0);
                etTestinfo.getEditableText().clear();
                etTestinfo.getEditableText().append(sp.getString("emergencyContact", ""));


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
