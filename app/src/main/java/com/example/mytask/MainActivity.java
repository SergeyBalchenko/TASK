package com.example.mytask;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator = new Calculator(3, 3);
        Calculator calculatorf = new Calculator(3f, 3f);

        int resultf = calculatorf.addf();
        int result2f = calculatorf.subtractionf();
        int result3f = calculatorf.divisionf();
        int result4f = calculatorf.multiplicationf();

        int result = calculator.add();
        int result2 = calculator.subtraction();
        int result3 = calculator.division();
        int result4 = calculator.multiplication();


//        int myInt = 4;
//        String s = "HELLO";
//        String space = " ";
//        String name = " Bob";
//        Log.v(TAG, s + space + name);
//        Log.v(TAG, "HELLO" + " Bob");
//        Log.v(TAG, "My number is " + myInt);
//
//        int value = 1;
//        while (value < 5) {
//            Log.v(TAG, "hello while " + value);
//            value = value + 1;
//        }
//        for (int i = 10; i >= 0; i = i - 4) {
//            Log.v(TAG, "hello for " + i);
//        }
//
//        if (myInt <= 1) {
//            Log.v(TAG, "yes right");
//        } else if (myInt > 20) {
//            Log.v(TAG, "no right");
//        } else {
//            Log.v(TAG, "last");
//        }
//        int a =7;
//        while (a<=98){
//            Log.v(TAG, String.valueOf(a) + " ");
//            a = a+7;
//        }
//        int task2 = 1;
//        while (task2 <= 512) {
//            Log.v(TAG, String.valueOf(task2) + " ");
//            task2 = task2 * 2;
//        }
//        if(5==5){
//            Log.v(TAG,"true2");
//        }
//        Scanner s = new Scanner (System.in);
//        Log.v(TAG,"write sumthing");
//        int x = s.nextLine();
//        String string = s.nextLine();
//        Log.v(TAG,"you write " +x);
//        Log.v(TAG,"you write " +string);

//        Scanner scanner = new Scanner(System.in);
//            Log.v(TAG,"введите 5");
//            int value = scanner.nextInt();
//            while(value!=5){
//                Log.v(TAG,"ВВедите 5");
//                value = scanner.nextInt();
//            }
//            Log.v(TAG,"Вы ввели 5");

//            int l = 1;
//            while (l<=10){
//                int v = Log.v(TAG, "Task " + l);
//                l = l + 1;
//            }
//        int s = 1;
//        s = s + 1;
//        do {
//            s = s / 5;
//        }   while (s % 2 == 0);
//            while (s <= 100) {
//            Log.v(TAG, String.valueOf(s));
//        }
//            for (int u =0;u<=15; u++){
//                if(u%2==0){
//                    continue;
//                }
//                Log.v(TAG,"это не четное число " +u);
//            }
//        int k = 0;
//        while(true){
//            if(k==15) {
//                break;
//            }
//                Log.v(TAG, String.valueOf(k));
//                k++;
//            }
//            Log.v(TAG,"мы вышли из цыкла ");

    }


}









