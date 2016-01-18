package com.example.akramkhan.cop290;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class confirmation extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent=getIntent();
        String[] enters=intent.getStringArrayExtra(RegistrationActivity.enter);
        TextView teamnames= (TextView) findViewById(R.id.TeamName);
        teamnames.setText(enters[0]);
        TextView name1= (TextView) findViewById(R.id.namea);
        name1.setText(enters[1]);
        TextView name2= (TextView) findViewById(R.id.nameb);
        name2.setText(enters[2]);
        TextView name3= (TextView) findViewById(R.id.namec);
        name3.setText(enters[3]);
        TextView entryno1= (TextView) findViewById(R.id.entrya);
        entryno1.setText(enters[4]);
        TextView entryno2= (TextView) findViewById(R.id.entryb);
        entryno2.setText(enters[5]);
        TextView entryno3= (TextView) findViewById(R.id.entryc);
        entryno3.setText(enters[6]);
    }
}
