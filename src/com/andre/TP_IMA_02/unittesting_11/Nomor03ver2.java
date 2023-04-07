package com.andre.TP_IMA_02.unittesting_11;

import java.util.Scanner;

public class Nomor03ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int pangkat = input * input;

        System.out.println(isKaprekar(input, pangkat));
    }

    static String isKaprekar(int input, int pangkat) {
        String kaprekar = "Ya";

        int jumlah = 0;
        while (pangkat > 0) {
            jumlah += pangkat % 10;
            pangkat /= 10;
        }
        if (jumlah != input) {
            kaprekar = "Bukan";
        }
        return kaprekar;
    }
}
