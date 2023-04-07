package TP_IMA.TP_IMA_01.scanner_02;

import java.util.Scanner;

public class AplikasiPengenalanOrang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaOrang = scanner.nextLine();
        int umur = scanner.nextInt();
        System.out.println("Halo, " + namaOrang);
        System.out.print("Ternyata usiamu baru " + umur);
        System.out.print(" tahun yaaa");
    }
}
