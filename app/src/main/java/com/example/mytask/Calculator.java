package com.example.mytask;

public class Calculator {

    public Calculator(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float a;
    public float b;

    public float add() {
        return a + b;
    }

    public float subtraction() {
        return a - b;
    }

    public float division() {
        return a / b;
    }

    public float multiplication() {
        return a * b;
    }
}