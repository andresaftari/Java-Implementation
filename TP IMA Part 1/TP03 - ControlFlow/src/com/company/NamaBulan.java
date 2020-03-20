package com.company;

import java.util.Scanner;

public class NamaBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namaBulan = scanner.nextInt();

        switch (namaBulan) {
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("Février");
                break;
            case 3:
                System.out.println("Marche");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juin");
                break;
            case 7:
                System.out.println("Juiliet");
                break;
            case 8:
                System.out.println("Auguste");
                break;
            case 9:
                System.out.println("Septembre");
                break;
            case 10:
                System.out.println("Octobre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Décembre");
                break;
        }
    }
}
