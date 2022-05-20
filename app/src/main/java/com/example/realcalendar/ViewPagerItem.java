package com.example.realcalendar;

import android.widget.CalendarView;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;

public class ViewPagerItem {

    TextView MonthsOfYear;
    CalendarView calendar_show;

    public ViewPagerItem(TextView MonthOfYear, CalendarView calendarshow){
        this.MonthsOfYear = MonthOfYear;
        this.calendar_show = calendarshow;
    }

    public ViewPagerItem(String monthYear) {
    }
}
