package com.example.mytask;

public class Calculator {

    private int a;
    private int b;


    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
//        this.d = d;
//        this.c = c;
    }

    public int add() {
        return a + b;
    }


    public int subtraction() {
        return a - b;
    }

    public float division() {
        float c = (float) a;
        float d = (float) b;
        if (c == 0) {
            return 0;
        } else if (d == 0) {
            return 0;
        } else
            return c / d;

    }

    public int multiplication() {

        return a * b;
    }

    public float divisionWithRemainder() {
        if (b == 0) {
            return 0;
        } else
            return a % b;
    }

    public int minFunction() {
        int min;
        if (a > b)
            min = b;
        else
            min = a;
        return min;
    }
}
// + 1. Поля private, не public
// + 2. Прочитать про public / private ...
// + 3. Проверить работу calculatorF() метода.
// + 4. Учесть случаи, если одно из чисел равно 0.
// 5.