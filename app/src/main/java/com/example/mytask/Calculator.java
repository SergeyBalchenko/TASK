package com.example.mytask;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Scanner;
import android.util.Log;


public class Calculator extends AppCompatActivity {
    public static void main(String[] args){

    }
}

class Lego {
    private float number1 = 1;
    private float number2 = 5;


    public Lego() {


        if( number1 >= number2 ){
            System.out.println ( number1 + " - это число больше" );
        }else{
//            Log.v(TAG,  number2  + " - это число больше");

        }
    }
    public Lego Addition; {
        double a = number1 + number2;
        System.out.println( number1 + "+" + number2 + "=" + a);
    }
    public Lego Subtraction; {
        double b = number1 - number2;
        System.out.println( number1 + "-" + number2 + "=" + b);
    }
    public Lego Division; {
        double d = number1 / number2;
        System.out.println( number1 + "/" + number2 + "=" + d);
    }
    public Lego Multiplication; {
        double c = number1 * number2;
        System.out.println( number1 + "*" + number2 + "=" + c);
    }
}
