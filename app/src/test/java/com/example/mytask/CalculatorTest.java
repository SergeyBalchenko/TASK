package com.example.mytask;

import com.example.mytask.domain.model.Calculator;

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
    public void shouldReturnMinFirstNumber() {
        Calculator calculator = new Calculator(1, 2);

        int expected = 1;
        int actual = calculator.minFunction();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinSecondNumber() {
        Calculator calculator = new Calculator(5, 2);

        int expected = 2;
        int actual = calculator.minFunction();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinNegativeFirstNumber() {
        Calculator calculator = new Calculator(-1, 2);

        int expected = -1;
        int actual = calculator.minFunction();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinZero() {
        Calculator calculator = new Calculator(0, 0);

        int expected = 0;
        int actual = calculator.minFunction();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinZeroAdd() {
        Calculator calculator = new Calculator(0, 0);

        int expected = 0;
        int actual = calculator.add();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNumberAdd() {
        Calculator calculator = new Calculator(1, 3);

        int expected = 4;
        int actual = calculator.add();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNumberSecondAdd() {
        Calculator calculator = new Calculator(99, 15);

        int expected = 114;
        int actual = calculator.add();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnDivisionZero() {
        Calculator calculator = new Calculator(0, 0);

        int expected = 0;
        int actual = calculator.minFunction();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinFirstZeroDivision() {
        Calculator calculator = new Calculator(0, 2);

        int expected = 0;
        float actual = calculator.division();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinSecondZeroNumber() {
        Calculator calculator = new Calculator(1, 0);

        int expected = 0;
        float actual = calculator.division();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNumberFirstNegative() {
        Calculator calculator = new Calculator(1, -1);

        int expected = 0;
        float actual = calculator.division();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnShortDivision() {
        Calculator calculator = new Calculator(4, 3);

        float expected = (float) 1.3333334;
        float actual = calculator.division();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnShortDivisionWithMinus() {
        Calculator calculator = new Calculator(3, -3);

        float expected = 0;
        float actual = calculator.division();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMultiplication() {
        Calculator calculator = new Calculator(3, 3);

        int expected = 0;
        int actual = calculator.multiplication();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMultiplicationMinus() {
        Calculator calculator = new Calculator(3, -1);

        int expected = -3;
        float actual = calculator.multiplication();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMultiplicationZero() {
        Calculator calculator = new Calculator(3, 0);

        int expected = 0;
        float actual = calculator.multiplication();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNumberSubtraction() {
        Calculator calculator = new Calculator(1, 3);

        int expected = -2;
        int actual = calculator.subtraction();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNumberSubtractionMinus() {
        Calculator calculator = new Calculator(3, -1);

        int expected = 4;
        int actual = calculator.subtraction();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNumberSubtractionZero() {
        Calculator calculator = new Calculator(1, 0);

        int expected = 1;
        int actual = calculator.subtraction();

        Assertions.assertEquals(expected, actual);
    }
}