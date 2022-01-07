package com.yulrud.autotest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends TestRunner {

    private static final Calc calculator = new Calc();

    @Test
    public void addTest() {
        Assert.assertEquals(calculator.add(10.001, 20.031), 30.032, 0);
        Assert.assertEquals(calculator.add(-10.001, 20.031), 10.03, 0);
        Assert.assertEquals(calculator.add(-10.001, -20.031), -30.032, 0);
        Assert.assertEquals(calculator.add(15.12345, 0), 15.12345, 0);
        Assert.assertEquals(calculator.add(0, 150000.00001), 150000.00001, 0);
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(calculator.subtract(-10.001, 20.031), -30.032, 0);
        Assert.assertEquals(calculator.subtract(-10.001, -20.031), 10.03, 0);
        Assert.assertEquals(calculator.subtract(10.001, 20.031), -10.03, 0);
        Assert.assertEquals(calculator.subtract(0, 111.33112), -111.33112, 0);
        Assert.assertEquals(calculator.subtract(111.33112, 0), 111.33112, 0);
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(calculator.multiply(0.0001, 222.3), 0.02223, 0);
        Assert.assertEquals(calculator.multiply(-222.3, -0.0001), 0.02223, 0);
        Assert.assertEquals(calculator.multiply(-222.3, 0.0001), -0.02223, 0);
        Assert.assertEquals(calculator.multiply(222.3, -0.0001), -0.02223, 0);
        Assert.assertEquals(calculator.multiply(0, -0.0001), 0, 0);
        Assert.assertEquals(calculator.multiply(222.3, 0), 0, 0);
    }

    @Test
    public void divideTest() {
        Assert.assertEquals(calculator.divide(10, 3), 3.3333333333333335, 0);
        Assert.assertEquals(calculator.divide(-10, -2000), 0.005, 0);
        Assert.assertEquals(calculator.divide(-10, 6), -1.6666666666666667, 0);
        Assert.assertEquals(calculator.divide(100000, -0.2), -500000, 0);
        Assert.assertEquals(calculator.divide(0, -0.0001), 0, 0);
        // Assert.assertEquals(calculator.divide(222.3, 0), Infinity, 0);
    }

    @Test
    public void modTest() {
        Assert.assertEquals(calculator.mod(3, 2), 1, 0);
        Assert.assertEquals(calculator.mod(10, 7), 3, 0);
    }

    @Test
    public void calculateVarTestSum() {
        Assert.assertEquals(calculator.calculateVar("+", 3, 2), 5, 0);
    }

    @Test
    public void calculateVarTestSubstract() {
        Assert.assertEquals(calculator.calculateVar("-", 3, 2), 1, 0);
    }

    @Test
    public void calculateVarTestMultiply() {
        Assert.assertEquals(calculator.calculateVar("*", 3, 2), 6, 0);
    }

    @Test
    public void calculateVarTestDivide() {
        Assert.assertEquals(calculator.calculateVar("/", 3, 2), 1.5, 0);
    }

    @Test
    public void calculateVarTestMod() {
        Assert.assertEquals(calculator.calculateVar("%", 3, 2), 1, 0);
    }

    @Test
    public void calculateVarTestOtherSign() {
        Assert.assertEquals(calculator.calculateVar("ju", 3, 2), 0, 0);
    }
}
