package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class SoalTiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] array = new int[input];


        for (int i = 0; i < input; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int var = array[0];
        int b = 0;
        int result = 0, max = 0;
        for (int data : array) {
            if (data == var) {
                if (b > max) {
                    max = b;
                    result = var;
                }
            } else {
                var = data;
                b = 1;
            }
        }
        System.out.println(result);
    }
}
