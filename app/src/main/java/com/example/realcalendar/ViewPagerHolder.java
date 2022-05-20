package com.example.realcalendar;

import static com.example.realcalendar.R.id.cellDayText;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewPagerHolder extends RecyclerView.ViewHolder{

    public final TextView dayOfMonth;
    public ViewPagerHolder(@NonNull View itemView)
    {
        super(itemView);
        dayOfMonth = itemView.findViewById(cellDayText);
    }
}
