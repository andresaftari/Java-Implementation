package com.company;

import java.util.Scanner;

public class MaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int[] value = new int[input];
        int n = 0;

        for (int i = 0; i < input; i++) {
            value[i] = scanner.nextInt();
        }
        for (int i = 0; i < input; i++) {
            n = n + value[i];
        }
        int max = value[0];
        for (int i = 1; i < input; i++) {
            if (value[i] > input) {
                max = value[i];
            }
        }
        System.out.println(max);
    }
}
