package TP_IMA.TP_IMA_01.controlflow_03;

import java.util.Scanner;

public class Enam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 6) System.out.println("TP_IMA.TP_IMA_01.controlflow_03.Enam"); // Apabila masukan adalah angka 6, cetak "TP_IMA.TP_IMA_01.controlflow_03.Enam"
        else System.out.println("Bukan enam"); // Apabila masukan selain angka 6, cetak "Bukan enam"
    }
}