package com.yulrud.autotest;

import java.util.Scanner;

public class InputCalc {

    private Scanner input;

    InputCalc() {
        input = new Scanner(System.in);
    }

    public float readVariable() {
        return Float.valueOf(this.input.nextLine());
    }

    public String readSign() {
        return this.input.nextLine();
    }
}
