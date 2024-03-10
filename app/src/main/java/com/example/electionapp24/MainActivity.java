package com.example.electionapp24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton ModulePageimgButton;
    ImageButton CalendarPageimgButton;
    ImageButton PollingPageimgButton;
    ImageButton SettingsPageimgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Access lessons from the toolbar
        ModulePageimgButton = (ImageButton) findViewById(R.id.PencilButtonCP);
        ModulePageimgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadModulePage = new Intent(MainActivity.this,ModulePage.class);
                startActivities(new Intent[]{intentLoadModulePage});
            }
        });
// When clicking the calendar button on the toolbar, it brings you to the calendar page.
        CalendarPageimgButton = (ImageButton) findViewById(R.id.CalendarButton);
        CalendarPageimgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadCalendarPage = new Intent(MainActivity.this,CalendarPage.class);
                startActivities(new Intent[] {intentLoadCalendarPage});
            }
        });
        // When clicking the graph button on the toolbar, it brings you to the polling data page.
    PollingPageimgButton = (ImageButton) findViewById(R.id.GraphButtonCp);
    PollingPageimgButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentLoadPollingPage = new Intent(MainActivity.this,PollingPage.class);
            startActivities(new Intent[] {intentLoadPollingPage});
        }
    });
    SettingsPageimgButton = (ImageButton) findViewById(R.id.SettingsButtonCP);
    SettingsPageimgButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentLoadSettingsPage = new Intent(MainActivity.this, SettingsPage.class);
            startActivities(new Intent[] {intentLoadSettingsPage});
        }
    });
    }

}