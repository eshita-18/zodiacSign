package com.example.zodaicsign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    Thread th=new Thread(){
        public  void run(){
            try{
                sleep(4000);

            }catch (Exception e){
                   e.printStackTrace();
            }finally {
                Intent i=new Intent(splash.this,MainActivity.class);
                startActivity(i);


            }
        }
    };th.start();

    }
}