package com.example.mytask;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator = new Calculator(3f, 3f);

        float result = calculator.add();
        float result2 = calculator.subtraction();
        float result3 = calculator.division();
        float result4 = calculator.multiplication();
    }
}









