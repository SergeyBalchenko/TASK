package com.example.mytask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calculator = new Calculator();
        calculator.add();
        calculator.divide();
        }
    }

        class Calculator {
            private float add = 1;
            private float divide = 5;


            void calculator() {
                if( add >= divide ){
                    System.out.println ( add + " - это число больше" );
                }else{
                Log.v(TAG,  number2  + " - это число больше");

                }
            }
            void addition() {
                double a = add + divide;
                System.out.println( add + "+" + divide + "=" + a);
            }
            void subtraction() {
                double b = add - divide;
                System.out.println( add + "-" + divide + "=" + b);
            }
            void division() {
                double d = add / divide;
                System.out.println( add + "/" + divide + "=" + d);
            }
            void multiplication() {
                double c = add * divide;
                System.out.println( add + "*" + divide + "=" + c);
            }
        }




