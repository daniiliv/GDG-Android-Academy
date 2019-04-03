package ru.androidacademy.spb.scheduleviewerdevfest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Open report about Aviasales.
        TextView shishkinReportTextView = findViewById(R.id.shishkin_report_name);
        shishkinReportTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShishkinReportActivity();
            }
        });

        //Open report about Kotlin.
        TextView ryabovReportTextView = findViewById(R.id.ryabov_report_name);
        ryabovReportTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRyabovReportActivity();
            }
        });

        //Open report about Multiplayer games.
        TextView pantReportTextView = findViewById(R.id.pant_report_name);
        pantReportTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPantReportActivity();
            }
        });


    }

    private void openShishkinReportActivity() {
        Intent shishkinReportActivityIntent = new Intent(this, ShishkinReportActivity.class);
        startActivity(shishkinReportActivityIntent);
    }

    private void openRyabovReportActivity() {
        Intent ryabovReportActivityIntent = new Intent(this, RyabovReportActivity.class);
        startActivity(ryabovReportActivityIntent);
    }

    private void openPantReportActivity() {
        Intent pantReportActivityIntent = new Intent(this, PantReportActivity.class);
        startActivity(pantReportActivityIntent);
    }
}
