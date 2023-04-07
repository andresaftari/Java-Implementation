package TP_IMA.TP_IMA_01.scanner_02;

import java.util.Scanner;

public class PembagianPermenDira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("KASUS PERTAMA");
        System.out.print("Jumlah permen Dira sebelumnya : ");
        int value1 = scanner.nextInt();
        System.out.print("Permen dibagi sama rata dengan teman Dira : ");
        int value2 = scanner.nextInt() +1;
        int hasil = value1 / value2;
        int hasil1 = value1 % value2;
        System.out.println("Setiap teman Dira mendapat permen sebanyak : " + hasil);
        System.out.println("Sisa permen di tangan Dira : " + hasil1);

        System.out.println( );
        System.out.println();
        System.out.println("KASUS KEDUA");
        System.out.print("Jumlah permen Dira sebelumnya : ");
        int value3 = scanner.nextInt();
        System.out.print("Permen dibagi ke teman Dira tidak sama rata : ");
        int value4 = scanner.nextInt() +1;
        int hasil2 = value3 / value4;
        int hasil3 = value3 % value4;
        System.out.println("Setiap teman Dira mendapat permen sebanyak : " + hasil2);
        System.out.println("Sisa permen di tangan Dira : " + hasil3);
    }
}
