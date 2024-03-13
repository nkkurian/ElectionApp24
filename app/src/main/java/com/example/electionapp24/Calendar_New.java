package com.example.electionapp24;

import android.media.metrics.Event;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calendar_New extends AppCompatActivity {

    String[] item = {"All", "General", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;
    TextView calendar_results_text;

    String Eventsinstate = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calendar_new);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        autoCompleteTextView = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, item);

        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                String item = adapterView.getItemAtPosition(i).toString();
                calendar_results_text = findViewById(R.id.TextCalendarResults);
                if (item == "Alabama") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Alaska") {
                    Eventsinstate = "March 5: Republican Presidential Primary \n April 6: Democratic Presidential Primary ";
                    statedata();
                } else if (item == "Arizona") {
                    Eventsinstate = "March 19: Presidential Primary";
                    statedata();
                } else if (item == "Arkansas") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "California") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Colorado") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Connecticut") {
                    Eventsinstate = "April 2: Presidential Primary";
                    statedata();
                } else if (item == "Delaware") {
                    Eventsinstate = "April 2: Presidential Primary";
                    statedata();
                } else if (item == "Florida") {
                    Eventsinstate = "March 19: Presidential Primary";
                    statedata();
                } else if (item == "Georgia") {
                    Eventsinstate = "March 12: Presidential Primary";
                    statedata();
                } else if (item == "Hawaii") {
                    Eventsinstate = "March 6: Democratic Presidential Primary \n March 12: Republican Presidential Caucus";
                    statedata();
                } else if (item == "Idaho") {
                    Eventsinstate = "March 2: Republican Presidential Caucus \n May 23: Democratic Presidential Caucus";
                    statedata();
                } else if (item == "Illinois") {
                    Eventsinstate = "March 19: Presidential Primary";
                    statedata();
                } else if (item == "Indiana") {
                    Eventsinstate = "May 7: Presidential Primary";
                    statedata();
                } else if (item == "Iowa") {
                    Eventsinstate = "January 15: Republican Presidential Caucus \n March 5: Democratic Presidential Primary";
                    statedata();
                } else if (item == "Kansas") {
                    Eventsinstate = "March 19: Presidential Primary";
                    statedata();
                } else if (item == "Kentucky") {
                    Eventsinstate = "May 21: Presidential Primary";
                    statedata();
                } else if (item == "Louisiana") {
                    Eventsinstate = "March 23: Presidential Primary";
                    statedata();
                } else if (item == "Maine") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Maryland") {
                    Eventsinstate = "May 14: Presidential Primary";
                    statedata();
                } else if (item == "Massachusetts") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Michigan") {
                    Eventsinstate = "February 27: Presidential Primary";
                    statedata();
                } else if (item == "Minnesota") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Mississippi") {
                    Eventsinstate = "March 12: Presidential Primary";
                    statedata();
                } else if (item == "Missouri") {
                    Eventsinstate = "March 2: Republican Presidential Caucus \n March 23: Democratic Presidential Primary";
                    statedata();
                } else if (item == "Montana") {
                    Eventsinstate = "June 4: Presidential Primary";
                    statedata();
                } else if (item == "Nebraska") {
                    Eventsinstate = "May 14: Presidential Primary";
                    statedata();
                } else if (item == "Nevada") {
                    Eventsinstate = "February 6: Democratic Presidential Primary \n February 8: Republican Presidential Primary";
                    statedata();
                } else if (item == "New Hampshire") {
                    Eventsinstate = "February 23: Presidential Primary";
                    statedata();
                } else if (item == "New Jersey") {
                    Eventsinstate = "June 4: Presidential Primary";
                    statedata();
                } else if (item == "New Mexico") {
                    Eventsinstate = "June 4: Presidential Primary";
                    statedata();
                } else if (item == "New York") {
                    Eventsinstate = "April 2: Presidential Primary";
                    statedata();
                } else if (item == "North Carolina") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "North Dakota") {
                    Eventsinstate = "March 4: Republican Presidential Caucus \n March 30: Democratic Presidential Primary";
                    statedata();
                } else if (item == "Ohio") {
                    Eventsinstate = "March 19: Presidential Primary";
                    statedata();
                } else if (item == "Oklahoma") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Oregon") {
                    Eventsinstate = "May 21: Presidential Primary";
                    statedata();
                } else if (item == "Pennsylvania") {
                    Eventsinstate = "April 23: Presidential Primary";
                    statedata();
                } else if (item == "Rhode Island") {
                    Eventsinstate = "April 2: Presidential Primary";
                    statedata();
                } else if (item == "South Carolina") {
                    Eventsinstate = "February 3: Democratic Presidential Primary \n February 24: Republican Presidential Primary";
                    statedata();
                } else if (item == "South Dakota") {
                    Eventsinstate = "June 4: Presidential Primary";
                    statedata();
                } else if (item == "Tennessee") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Texas") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Utah") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Vermont") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Virginia") {
                    Eventsinstate = "March 5: Presidential Primary";
                    statedata();
                } else if (item == "Washington") {
                    Eventsinstate = "March 12: Presidential Primary";
                    statedata();
                } else if (item == "West Virginia") {
                    Eventsinstate = "May 14: Presidential Primary";
                    statedata();
                } else if (item == "Wisconsin") {
                    Eventsinstate = "May 2: Presidential Primary";
                    statedata();
                } else if (item == "Wyoming") {
                    Eventsinstate = "April 13: Presidential Primary";
                    statedata();
                } else if (item == "General") {
                    Eventsinstate = "June 15 - 18: RNC \n August 19-22: DNC \n October 1: Presidential Debate \n October 9: Presidential Debate \n November 5: General Election";
                    statedata();
                } else
                    calendar_results_text.setText("January 15: Iowa Republican Caucus \n\n\n January 23: New Hampshire Presidential Primary \n\n\n February 3: South Carolina Democratic Primary \n\n\n February 6: Nevada Democratic Primary \n\n\n February 8: Nevada Republican Primary \n\n\n February 24: South Carolina Republican Primary \n\n\n February 27: Michigan Primary \n\n\n March 2: Michigan Republican Caucus \n\n\n March 3: District of Columbia Republican Primary \n\n\n March 4: North Dakota Republican Caucus \n\n\n March 5: Alaska Republican Primary \n      Alabama, Arkansas, California, Colorado, Iowa, Maine, Massachusetts, Minnesota, North Carolina, Oklahoma, Tennessee, Texas, Utah, Vermont, and Virginia Presidential Primary\n\n\n March 6: Hawaii Democratic Primary \n\n\n March 12: Georgia, Mississippi, Washington Primary\n       Hawaii Republican Caucus\n\n\n March 19: Arizona, Florida, Illinois, Kansas, Ohio Primary \n\n\n March 23: Louisiana Presidential Primary \n\n\n      Missouri Democratic Primary\n\n\nMarch 30: North Dakota Democratic Primary \n\n\n April 2: Connecticut, Delaware, New York, Rhode Island, Wisconsin Primary \n\n\n April 6: Alaska Democratic Primary\n\n\n April 13: Wyoming Democratic Primary \n\n\n April 23: Pennsylvania Primary \n\n\n May 7: Indiana Primary \n\n\n May 14: Maryland, West Virginia, Nebraska Primary \n\n\n May 21: Kentucky and Oregon Primary \n\n\n May 23: Idaho Democratic Caucus \n\n\n June 4: New Jersey, New Mexico, South Dakota Primary \n\n\n July 15-18: Republican National Convention \n\n\n August 19-20: Democratic National Convention \n\n\n November 5: General Election");
            }
        });
    }

    public void statedata() {
        calendar_results_text.setText(Eventsinstate);
    }
}


