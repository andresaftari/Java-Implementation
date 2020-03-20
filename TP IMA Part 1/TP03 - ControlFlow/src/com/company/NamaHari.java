package com.company;

import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hariBerikutnya = scanner.nextInt();
        hariBerikutnya %= 7;

        switch (hariBerikutnya) {
            case 0:
                System.out.println("Verdedi");
                break;
            case 1:
                System.out.println("Samedi");
                break;
            case 2:
                System.out.println("Dimanche");
                break;
            case 3:
                System.out.println("Lundi");
                break;
            case 4:
                System.out.println("Mardi");
                break;
            case 5:
                System.out.println("Mercredi");
                break;
            case 6:
                System.out.println("Jeudi");
                break;
        }
    }
}