package com.andre.TP_IMA_02.unittesting_11;

import java.util.Scanner;

public class Nomor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        changeCase(sentence);
    }
    static String changeCase(String sentence) {
        String ubah = null;

        for (int i = 0; i < sentence.length(); i++) {
            String huruf = String.valueOf(sentence.charAt(i));
            String kata = String.valueOf(sentence.charAt(i));
            ubah = "";

            if (kata.equals(huruf.toUpperCase())) {
                ubah += huruf.toLowerCase();
            }
            else {
                ubah += huruf.toUpperCase();
            }

            System.out.print(ubah);
        }
        return ubah;
    }
}
