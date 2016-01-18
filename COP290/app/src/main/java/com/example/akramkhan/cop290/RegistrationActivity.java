
package com.example.akramkhan.cop290;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
    public static String enter="ft";
    public void finalView(View view){
        Intent intent=new Intent(this,confirmation.class);
        EditText teamname= (EditText) findViewById(R.id.TeamName);
        EditText namea= (EditText) findViewById(R.id.namea);
        EditText nameb= (EditText) findViewById(R.id.nameb);
        EditText namec= (EditText) findViewById(R.id.namec);
        EditText entrya= (EditText) findViewById(R.id.entrya);
        EditText entryb= (EditText) findViewById(R.id.entryb);
        EditText entryc= (EditText) findViewById(R.id.entryc);
        String[] entries=new String[7];
        entries[0]=teamname.getText().toString();
        entries[1]=namea.getText().toString();
        entries[2]=nameb.getText().toString();
        entries[3]=namec.getText().toString();
        entries[4]=entrya.getText().toString();
        entries[5]=entryb.getText().toString();
        entries[6]=entryc.getText().toString();
        intent.putExtra(enter,entries);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registration, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
