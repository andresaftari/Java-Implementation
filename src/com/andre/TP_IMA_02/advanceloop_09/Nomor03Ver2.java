package com.andre.TP_IMA_02.advanceloop_09;

import java.util.Scanner;

public class Nomor03Ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kodeDNA1 = scanner.nextLine();
        String kodeDNA2 = scanner.nextLine();

        String kode = "DNA identik";
        for (int i = 0; i < kodeDNA1.length(); i++) {
            if (kodeDNA1.charAt(i) != kodeDNA2.charAt(i)) {
                kode = "DNA berbeda";
                break;
            }
        }
        System.out.println(kode);
    }
}

