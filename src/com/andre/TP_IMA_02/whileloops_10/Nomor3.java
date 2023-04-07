package com.andre.TP_IMA_02.whileloops_10;

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getNotes;
        int jumlah = 0;

        do {
            getNotes = scanner.nextInt();
            jumlah += getNotes;
        }
        while (getNotes != 0);
        System.out.println(jumlah);
    }
}
