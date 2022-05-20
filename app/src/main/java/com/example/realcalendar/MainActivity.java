package com.example.realcalendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{
    private LocalDate selectedDate;
    LocalDate date;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        selectedDate = LocalDate.now();
    }

    private void initWidgets()
    {
        viewPager = findViewById(R.id.vp2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        String MonthYear = selectedDate.format(formatter);

        ViewPagerItem viewPagerItem = new ViewPagerItem(MonthYear);
        viewPagerItemArrayList = new ArrayList<>();
        viewPagerItemArrayList.add();

    }
}