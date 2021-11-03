package com.example.zodaicsign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    String name;
EditText datepicker;
EditText nameInput;
TextView zodiac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datepicker=findViewById(R.id.date);
        zodiac=findViewById(R.id.zodiac);
        nameInput=findViewById(R.id.name);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }

    private void show() {
        DatePickerDialog date=new DatePickerDialog(this,this,
                Calendar.getInstance().get(Calendar.YEAR),
        Calendar.getInstance().get(Calendar.MONTH),
        Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
         date.show();

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        month = month+1;
        String day=dayOfMonth + "/" +month+"/"+year;
        name = nameInput.getText().toString();
        datepicker.setText(day);
        zodiac.setText("Hello "+ name +" Your zodiac sign is"+ getZodaicSign(dayOfMonth,month-1));


    }
    private String getZodaicSign(int dayOfMonth, int month){
        String Zodiac="";
        if(month==0){
            if(dayOfMonth<20) Zodiac = "Capricorn. You are ambitious organized and practical";
            else Zodiac = "Aquarius. You are Unique and Visionary,you do things in your own way and time";
        }
        if(month==1){
            if(dayOfMonth<20) Zodiac = "Aquarius. You are Unique and Visionary,you do things in your own way and time";
            else Zodiac = "Pisces. You are very romantic and empathetic";
        }
        if(month==2){
            if(dayOfMonth<20) Zodiac = "Pisces. You are very romantic and empathetic";
            else Zodiac = "Aries. When meeting people, You are direct,a ssertive and confident";
        }
        if(month==3){
            if(dayOfMonth<20) Zodiac = "Aries. When meeting people, You are direct,a ssertive and confident";
            else Zodiac = "Taurus. You are loyal and dedicated. It takes you a minute to warm up people.";
        }
        if(month==4){
            if(dayOfMonth<20) Zodiac = "Taurus. You are loyal and dedicated. It takes you a minute to warm up people.";
            else Zodiac = "Gemini. You are playful, expressive and curious";
        }
        if(month==5){
            if(dayOfMonth<20) Zodiac = "Gemini. You are playful, expressive and curious";
            else Zodiac = "Cancer. You are caring dedicated and sensitive";
        }
        if(month==6){
            if(dayOfMonth<20) Zodiac = "Cancer. You are caring dedicated and sensitive";
            else Zodiac = "Leo. You are radiantly joyful and liberal";
        }
        if(month==7){
            if(dayOfMonth<20) Zodiac = "Leo. You are radiantly joyful and liberal";
            else Zodiac = "Virgo. You are practical sensible and loyal";
        }
        if(month==8){
            if(dayOfMonth<20) Zodiac = "Virgo. You are practical sensible and loyal";
            else Zodiac = "Libra. You are charming beautiful and well-balanced";
        }

        if(month==9){
            if(dayOfMonth<20) Zodiac = "Libra. You are charming beautiful and well-balanced";
            else Zodiac = "Scorpious. You are profound thinker,sensitive and passionate.";
        }
        if(month==10){
            if(dayOfMonth<20) Zodiac = "Scorpious. You are profound thinker,sensitive and passionate.";
            else Zodiac = "Sagittarius. You are bold, enthusiastic and positive";
        }
        if(month==11){
            if(dayOfMonth<20) Zodiac = "Sagittarius. You are bold, enthusiastic and positive";
            else Zodiac = "Capricorn. You are ambitious organized and practical";
        }

        return Zodiac;
    }
}