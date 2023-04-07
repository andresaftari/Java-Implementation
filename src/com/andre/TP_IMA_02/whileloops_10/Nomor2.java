package com.andre.TP_IMA_02.whileloops_10;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int pembalik = 0;

        while (input > 0) {
            pembalik = pembalik * 10;
            pembalik = pembalik + input % 10;
            input = input / 10;
        }
        System.out.println(pembalik);
    }
}
