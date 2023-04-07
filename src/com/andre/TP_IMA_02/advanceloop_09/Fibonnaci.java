package com.andre.TP_IMA_02.advanceloop_09;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.print(1);
        int num0 = 0;
        int num1 = 1;
        int numNext = num0 + num1;

        while (num1 < 1000) {
            num0 = num1;
            num1 = numNext;
            numNext = num1 + num0;
            System.out.print(", " + num1);
        }
    }
}
