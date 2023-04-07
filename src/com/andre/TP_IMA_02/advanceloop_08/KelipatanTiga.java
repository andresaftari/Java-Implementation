package com.andre.TP_IMA_02.advanceloop_08;

import java.util.Scanner;

public class KelipatanTiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelipatan = 3;
        //Kelipatannya berapa
        int n = sc.nextInt();
        //Mau diulang berapa pengulangan
        int start = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(start * kelipatan);
            start++;
        }
    }
}
