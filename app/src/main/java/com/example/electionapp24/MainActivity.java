package com.example.electionapp24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Opens the Module Page
        View MainPageModuleButton = findViewById(R.id.MPModulesButton);
        MainPageModuleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityModulePage();
            }
        });
    
    }

    // Function to open Module Page
    public void openActivityModulePage() {
        Intent intent = new Intent(this, ModulePage.class);
        startActivities(new Intent[]{intent});
    }
}