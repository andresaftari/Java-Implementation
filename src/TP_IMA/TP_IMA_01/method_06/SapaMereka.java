package TP_IMA.TP_IMA_01.method_06;

import java.util.Scanner;

public class SapaMereka {
    private static void haloSemua(String nama) {
        System.out.println("Halo, " + nama + ". Selamat pagi.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama1 = scanner.nextLine();
        String nama2 = scanner.nextLine();
        String nama3 = scanner.nextLine();
        haloSemua(nama1);
        haloSemua(nama2);
        haloSemua(nama3);
    }
}