package com.trip.lnt.lnt_trip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int mul(int varA, int varB) {
        int result;
        result = varA * varB;
        return result;
    }

    public int div(int varA, int varB) {
        int result;
        result = varA / varB;
        return result;
    }

    public int power(int varA, int varB) {
        int result;
        result = varA ^ varB;
        return result;
    }
}