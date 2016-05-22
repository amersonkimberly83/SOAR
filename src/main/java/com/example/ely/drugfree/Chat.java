package com.example.ely.drugfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView;
import static android.widget.Toast.*;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Chat extends AppCompatActivity implements OnItemSelectedListener{
    private Spinner spinnerChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        spinnerChat = (Spinner) findViewById(R.id.spinnerUsers);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.users, android.R.layout.simple_spinner_item);

        spinnerChat.setAdapter(adapter);
        spinnerChat.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView selectedUser = (TextView) view;
        makeText(this, "You selected: " + selectedUser.getText(), LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
