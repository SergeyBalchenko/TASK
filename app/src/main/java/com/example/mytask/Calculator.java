package com.example.mytask;

public class Calculator {

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int a;
    public int b;

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

    public void int minFunction () {
        int min;
        if (a > b)
            min = b;
        else
            min = a;

        return min;
    }
}
//    Ну вот тогда тебе такое задание:
//  +  Создай класс - калькулятор.
//  +  Я этот класс хочу вызвать из MainActivity().
//  +  Работать я буду только с двум числами.
//   + Я хочу уметь умножать, делить с остатком и без остатка, вычитать и сочетать.
//    Также. Хочу иметь возможность узнать какое из двух чисел больше.
//
//            Кирилл, [26.04.2022 21:04]
//            1) В конструктор я буду передавать int значения, не float.
//            2) Ты написал 4 метода, которые складывают, вычитают и тд. Они все возвращали int. В чем была проблема написать еще один метод, чтобы он возвращал мне float? Для деления с остатком.
//            3) Как мне узнать какое из двух чисел больше?