package com.yulrud.autotest;

public class Main {
    public static void main(String[] args) {
        InputCalc input = new InputCalc();
        Calc calculator = new Calc();
        System.out.println("Enter value1");
        double variable1 = input.readVariable();
        System.out.println("Input sign");
        String sign = input.readSign();
        System.out.println("Enter value2");
        double variable2 = input.readVariable();
        System.out.println("Result is: " + calculator.calculateVar(sign, variable1, variable2));
    }
}
