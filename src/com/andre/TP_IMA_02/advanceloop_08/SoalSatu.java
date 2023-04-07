package com.andre.TP_IMA_02.advanceloop_08;

import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputN = sc.nextInt();
        int inputK = sc.nextInt();

        for (int i = 1; i <= inputN; i++) {
            if (i % inputK == 0) {
                System.out.print(" * ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}