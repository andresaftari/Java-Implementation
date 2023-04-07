package com.andre.TP_IMA_01.scanner_02;

import java.util.Scanner;

public class TabunganDira {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("TABUNGAN DIRA : ");
        int value1 = input.nextInt();
        System.out.print("HARI DIRA MENABUNG : ");
        int value2 = input.nextInt();
        int hasil = value1 * value2;
        System.out.print("MAKA, JUMLAH TABUNGAN DIRA SELAMA N HARI Rp" + hasil);
    }
}
