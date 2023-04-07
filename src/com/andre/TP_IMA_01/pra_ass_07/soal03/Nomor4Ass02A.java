package com.andre.TP_IMA_01.pra_ass_07.soal03;

import java.util.Scanner;

public class Nomor4Ass02A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        int assembly1;
        int assembly2;

        for (int i = 1; i <= testCase; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int num1L = (num1 / 100);
            int num1M = (num1 % 100 / 10) * 10;
            int num1R = (num1 % 10) * 100;

            int num2L = (num2 / 100);
            int num2M = (num2 % 100 / 10) * 10;
            int num2R = (num2 % 10) * 100;

            assembly1 = num1L + num1M + num1R;
            assembly2 = num2L + num2M + num2R;

            if (num1L == 0 && num2L == 0) {
                assembly1 = num1M + num1R;
                assembly2 = num2M + num2R;
            }
            System.out.println((assembly1 + assembly2) / 10);
        }
    }
}
