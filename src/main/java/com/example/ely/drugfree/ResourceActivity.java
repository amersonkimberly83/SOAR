package com.example.ely.drugfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class ResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);

        final Button bNarcan = (Button) findViewById(R.id.bNarcan);
        final Button bSyringe = (Button) findViewById(R.id.bSyringe);
        final Button bFAQ = (Button) findViewById(R.id.bFAQ);
        final Button bTreatment = (Button) findViewById(R.id.bTreatment);

        bNarcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resourceIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/embed/Jis6NlZMV2c"));
                startActivity(resourceIntent);
            }
        });

        bSyringe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resourceIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nasen.org/directory/"));
                startActivity(resourceIntent);
            }
        });

        bFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resourceIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hopefornhrecovery.org/it-s-a-disease/faqs-about-addiction"));
                startActivity(resourceIntent);
            }
        });

        bTreatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resourceIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://interventionamerica.org"));
                startActivity(resourceIntent);
            }
        });
    }
}
