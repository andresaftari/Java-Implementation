package com.andre.TP_IMA_02.unittesting_11;

import java.util.Scanner;

public class Nomor01 {
    static int isFibonacci(int n) {
        if (n <= 1)
            return n;
        return isFibonacci(n - 1) + isFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isFibonacci(n - 1));
    }
}
