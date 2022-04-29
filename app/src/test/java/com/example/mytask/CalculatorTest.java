package com.example.mytask;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator(1, 2);

        int expected = 3;
        int actual = calculator.add();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtraction() {
    }

    @Test
    public void division() {
    }

    @Test
    public void multiplication() {
    }

    @Test
    public void calculatorF() {
    }

    @Test
    public void minFunction() {
    }
}