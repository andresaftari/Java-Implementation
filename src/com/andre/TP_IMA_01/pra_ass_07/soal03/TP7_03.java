package com.andre.TP_IMA_01.pra_ass_07.soal03;

import java.util.Random;
import java.util.Scanner;

public class TP7_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();
        System.out.println(passwordBaru(kata + " "));
    }

    private static String passwordBaru(String password) {
        Random random = new Random();
        String symbol = "!@#$%&?";

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int symbols = random.nextInt(symbol.length());
        String randomSymbols = symbol.substring(symbols, symbols + 1);

        password = password.replaceAll(" ", randomSymbols + number1 + number2);
        return password;
    }
}
