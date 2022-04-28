package com.example.mytask;

public class Calculator {
    public int a;
    public int b;

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
        return a / b;
    }

    public int multiplication() {
        return a * b;
    }

    public float calculatorF() {
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