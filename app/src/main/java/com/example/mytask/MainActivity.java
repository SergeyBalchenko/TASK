package com.example.mytask;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator = new Calculator(10, 3);
//        String result2 = String.format("%.3f",calculator.division());
        int result = calculator.add();
        int result1 = calculator.subtraction();
        float result2 = calculator.division();
        int result3 = calculator.multiplication();
        float result4 = calculator.divisionWithRemainder();

        Log.v(TAG, "add " + result);
        Log.v(TAG, "subtraction " + result1);
        Log.v(TAG, "multiplication " + result3);
        Log.v(TAG, "division " + result2);
        Log.v(TAG, "divisionWithRemainder " + result4);
    }
}