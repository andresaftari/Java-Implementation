package com.andre.TP_IMA_02.unittesting_11;

import java.util.Scanner;

public class Nomor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        boolean kaprekarCheck = kaprekarCheck(input);

        if (kaprekarCheck)
            System.out.println("YA");
        else
            System.out.println("BUKAN");
    }

    static boolean kaprekarCheck(int input) {
        int square = input * input;
        int squareLenght = String.valueOf(square).length();
        String strSquare = String.valueOf(square);

        boolean isKaprekar = false;

        for (int i = 2; i < squareLenght - 1; i++) {
            int leftNum = Integer.parseInt(strSquare.substring(0, i));
            int rightNum = Integer.parseInt(strSquare.substring(i));

            if (leftNum + rightNum == input)
                isKaprekar = true;
        }
        return isKaprekar;
    }
}
