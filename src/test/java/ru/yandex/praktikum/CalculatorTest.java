package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int firstNumber;
    private final int secondNumber;
    private final int expected; // создали поля тестового класса

    public CalculatorTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected; // создали конструктор тестового класса
    }

    @Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][] {
                { 1, 9, 10},
                { 1, 0, 1},
                { 1, -2, -1},
        };
    }


    @Test
    public void shouldBeSum(){
        int result = Calculator.sum(firstNumber,secondNumber);
        Assert.assertEquals("Sum not match!",expected , result);
    }
}