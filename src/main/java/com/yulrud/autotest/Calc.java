package com.yulrud.autotest;

public class Calc {
    public double add(double var1, double var2) {
        return Math.round((var1 + var2) * 100000) / 100000.0d;
    }

    public double multiply(double var1, double var2) {
        return Math.round((var1 * var2) * 100000) / 100000.0d;
    }

    public double subtract(double var1, double var2) {
        return Math.round((var1 - var2) * 100000) / 100000.0d;
    }

    public double divide(double var1, double var2) {
        try {
            return var1 / var2;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            return var1 / var2;
        }
    }

    public double mod(double var1, double var2) {
        try {
            return var1 % var2;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            return var1 % var2;
        }
    }

    public double calculateVar(String sign, double var1, double var2) {
        if (sign.equals("+")) {
            return this.add(var1, var2);
        } else if (sign.equals("-")) {
            return this.subtract(var1, var2);
        } else if (sign.equals("/")) {
            return this.divide(var1, var2);
        } else if (sign.equals("*")) {
            return this.multiply(var1, var2);
        } else if (sign.equals("%")) {
            return this.mod(var1, var2);
        } else {
            System.out.println("Uknnown sign is used");
            return 0;
        }
    }
}
