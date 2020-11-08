package com.example.butapp;


import android.graphics.Color;
import android.os.Bundle;
import android.text.Spanned;
import android.text.SpannableString;

import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myMethod(View view)
    {


        TextView textView=(TextView)findViewById(R.id.textview);

        SpannableString s = new SpannableString("You Tapped Red Button");
        ForegroundColorSpan fRed = new ForegroundColorSpan(Color.parseColor("#ff0000"));

        s.setSpan(fRed, 11, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(s);
    }
    public void myMethod1(View view)
    {

        TextView textView=(TextView)findViewById(R.id.textview);


        SpannableString s = new SpannableString("You Tapped Green Button");
        ForegroundColorSpan fRed = new ForegroundColorSpan(Color.parseColor("#006400"));

        s.setSpan(fRed, 11, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(s);
    }
    public void myMethod2(View view)
    {


        TextView textView=(TextView)findViewById(R.id.textview);

        SpannableString s = new SpannableString("You Tapped Yellow Button");
        ForegroundColorSpan fRed = new ForegroundColorSpan(Color.parseColor("#FFFF00"));

        s.setSpan(fRed, 11, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(s);
    }
    public void myMethod3(View view)
    {


        TextView textView=(TextView)findViewById(R.id.textview);

        SpannableString s = new SpannableString("You Tapped Blue Button");
        ForegroundColorSpan fRed = new ForegroundColorSpan(Color.parseColor("#0000FF"));

        s.setSpan(fRed, 11, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(s);
    }
    public void myMethod4(View view)
    {


        TextView textView=(TextView)findViewById(R.id.textview);

        SpannableString s = new SpannableString("You Tapped Black Button");
        ForegroundColorSpan fRed = new ForegroundColorSpan(Color.parseColor("#000000"));

        s.setSpan(fRed, 11, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(s);
    }
    public void myMethod5(View view)
    {


        TextView textView=(TextView)findViewById(R.id.textview);


        SpannableString s = new SpannableString("You Tapped Purple Button");
        ForegroundColorSpan fRed = new ForegroundColorSpan(Color.parseColor("#6a0dad"));

        s.setSpan(fRed, 11, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(s);
    }
}