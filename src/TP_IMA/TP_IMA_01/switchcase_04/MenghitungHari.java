package TP_IMA.TP_IMA_01.switchcase_04;

import java.util.Scanner;

public class MenghitungHari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namaHari = scanner.nextInt();
        namaHari %= 7;

        switch (namaHari) {
            case 0:
                System.out.println("Vendredi");
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
