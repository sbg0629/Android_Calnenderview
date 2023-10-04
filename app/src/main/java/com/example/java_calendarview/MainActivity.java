package com.example.java_calendarview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import com.example.java_calendarview.R;


public class MainActivity extends AppCompatActivity {

    CalendarView cal;
    TextView tv_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal = findViewById(R.id.cal);
        tv_text = findViewById(R.id.textView2);


        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                tv_text.setText(year + "년 " + (month + 1) + "월 " + day + "일 선택");
            }
        });

    }
}