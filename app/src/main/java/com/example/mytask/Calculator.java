package com.example.mytask;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }


    public int subtraction() {
        return a - b;
    }

    public int division() {
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 0;
        } else
            return a / b;
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