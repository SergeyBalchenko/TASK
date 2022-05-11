package com.example.mytask;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator = new Calculator(3, 0);
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


        Classroom mainHall = new Classroom();
        mainHall.setName("fdsgsd");
        mainHall.setLocation("mayor");
        Log.v(TAG,"gg" + mainHall.getName());


//        ArrayList<String> myArrayList = new ArrayList<String>();
//
//        myArrayList.add("Hey!");
//        myArrayList.add("This");
//        myArrayList.add("is");
//        myArrayList.add("my");
//        myArrayList.add("first");
//        myArrayList.add("list!");
//
//        for (int i = 0; i < myArrayList.size(); i++)
//            Log.v(TAG,(myArrayList.get(i)));

    }
}
