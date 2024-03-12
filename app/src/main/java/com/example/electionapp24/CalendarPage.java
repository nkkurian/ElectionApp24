package com.example.electionapp24;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.github.sundeepk.compactcalendarview.domain.Event;

public class CalendarPage extends AppCompatActivity {

    CalendarView simpleCalendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_page);
        simpleCalendarView = (CalendarView) findViewById(R.id.ElectionCalendar); // get the reference of CalendarView
        simpleCalendarView.setFocusedMonthDateColor(Color.RED); // set the red color for the dates of  focused month
        simpleCalendarView.setUnfocusedMonthDateColor(Color.BLUE); // set the yellow color for the dates of an unfocused month
        simpleCalendarView.setSelectedWeekBackgroundColor(Color.RED); // red color for the selected week's background
        simpleCalendarView.setWeekSeparatorLineColor(Color.GREEN); // green color for the week separator line
        // perform setOnDateChangeListener event on CalendarView
        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {


                // The dates for each election event is shown on the screen using an if statement. If the condition is met, a custom toast will appear saying what is the event. If not the toast will say "No Events".
                if ((month == (1 - 1)) && (dayOfMonth == 15)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Republican Presidential Caucus");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (1 - 1)) && (dayOfMonth == 23)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("New Hampshire Presidential Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (2 - 1)) && (dayOfMonth == 3)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("South Carolina Democratic Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (2 - 1)) && (dayOfMonth == 6)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Nevada Democratic Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (2 - 1)) && (dayOfMonth == 8)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Nevada Republican Primary");
                    TextView textView1 = layout.findViewById(R.id.textView11);
                    textView1.setText("Virgin Islands Republican Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (2 - 1)) && (dayOfMonth == 24)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("South Carolina Republican Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (2 - 1)) && (dayOfMonth == 27)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Michigan Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 2)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Michigan Republican Caucus");
                    TextView textView1 = layout.findViewById(R.id.textView11);
                    textView1.setText("Idaho Republican Caucus");
                    TextView textView2 = layout.findViewById(R.id.textView12);
                    textView2.setText("Missouri Republican Caucus");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 3)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("District of Columbia Republican Primary");
                    textView.setTextSize(16);
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 4)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("North Dakota Republican Caucus");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 5)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView12);
                    textView.setText("Alaska Republican Primary");
                    textView.setTextSize(16);
                    TextView textView1 = layout.findViewById(R.id.textView11);
                    textView1.setText("Alabama, Arkansas, California, Colorado,");
                    textView1.setTextSize(16);
                    TextView textView2 = layout.findViewById(R.id.textView10);
                    textView2.setText("Iowa, Maine, Massachusetts, Minnesota,");
                    textView2.setTextSize(16);
                    TextView textView3 = layout.findViewById(R.id.textView13);
                    textView3.setText("North Carolina, Oklahoma, Tennessee,");
                    textView3.setTextSize(16);
                    TextView textView4 = layout.findViewById(R.id.textView14);
                    textView4.setText("Texas, Utah, Vermont, and Virginia Presidential Primary");
                    textView4.setTextSize(16);
                    TextView textView5 = layout.findViewById(R.id.textView15);
                    textView5.setText("American Samoa Democratic Caucus");
                    textView5.setTextSize(16);
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 6)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Hawaii Democratic Primary ");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 8)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("American Samoa Republican Caucus");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 12)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Georgia, Mississippi, Washington Primary");
                    textView.setTextSize(16);
                    TextView textView2 = layout.findViewById(R.id.textView11);
                    textView2.setText("Hawaii Republican Caucus");
                    textView2.setTextSize(16);
                    TextView textView3 = layout.findViewById(R.id.textView13);
                    textView3.setText("Northern Mariana Islands Democratic Primary");
                    textView3.setTextSize(16);
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 15)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Northern Mariana Islands Republican Caucus");
                    textView.setTextSize(15);
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 16)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Guam Republican Caucus");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 19)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Arizona, Florida, Illinois,");
                    TextView textView2 = layout.findViewById(R.id.textView13);
                    textView2.setText("Kansas, Ohio Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 23)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Louisiana Presidential Primary");
                    TextView textView2 = layout.findViewById(R.id.textView13);
                    textView2.setText("Missouri Democratic Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (3 - 1)) && (dayOfMonth == 30)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("North Dakota Democratic Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (4 - 1)) && (dayOfMonth == 2)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Connecticut, Delaware, New York");
                    TextView textView2 = layout.findViewById(R.id.textView13);
                    textView2.setText("Rhode Island, Wisconsin Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (4 - 1)) && (dayOfMonth == 6)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Alaska Democratic Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (4 - 1)) && (dayOfMonth == 13)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Wyoming Democratic Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (4 - 1)) && (dayOfMonth == 21)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Puerto Rico Republican Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (4 - 1)) && (dayOfMonth == 23)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Pennsylvania Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (4 - 1)) && (dayOfMonth == 28)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Puerto Rico Democratic Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (5 - 1)) && (dayOfMonth == 7)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Indiana Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (5 - 1)) && (dayOfMonth == 14)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Maryland, West Virginia, Nebraska Primary");
                    textView.setTextSize(16);
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (5 - 1)) && (dayOfMonth == 21)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Kentucky and Oregon Primary");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (5 - 1)) && (dayOfMonth == 23)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Idaho Democratic Caucus");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (6 - 1)) && (dayOfMonth == 4)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("New Jersey, New Mexico, South Dakota Primary");
                    textView.setTextSize(15);
                    TextView textView2 = layout.findViewById(R.id.textView11);
                    textView2.setText("District of Columbia Democratic Primary");
                    textView2.setTextSize(16);
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (6 - 1)) && (dayOfMonth == 8)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Guam and Virgin Islands Democratic Primary");
                    textView.setTextSize(16);
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else if ((month == (11 - 1)) && (dayOfMonth == 5)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("General Election");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                }else if ((month == (7 - 1)) && (dayOfMonth == 15 || dayOfMonth == 16 || dayOfMonth == 17 || dayOfMonth == 18)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Republican National Convention");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                }else if ((month == (8 - 1)) && (dayOfMonth == 19 || dayOfMonth == 20)) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("Democratic National Convention");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                }
                else {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.calendar_toast, (ViewGroup) findViewById(R.id.calendartoastlayout));
                    TextView textView = layout.findViewById(R.id.textView10);
                    textView.setText("No events");
                    final Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 0, 450);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                }

            }
        });
}
}