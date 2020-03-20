package com.company;

import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        final double phi = 3.14;
        Scanner scanner = new Scanner(System.in);

        String bangunDatar = scanner.nextLine();
        int panjang;
        int lebar;
        int sisi;
        int diameter;
        int alas;
        int tinggi;

        switch (bangunDatar) {
            case "persegi":
                sisi = scanner.nextInt();
                int luasPersegi = sisi*sisi;
                int kelilingPersegi = 4*sisi;
                System.out.println(luasPersegi + " " + kelilingPersegi);
                break;

            case "persegi panjang":
                panjang = scanner.nextInt();
                lebar = scanner.nextInt();
                int luasPersegiPanjang = panjang*lebar;
                int kelilingPersegiPanjang = (2*panjang)+(2*lebar);
                System.out.println(luasPersegiPanjang + " " + kelilingPersegiPanjang);
                break;

            case "segitiga":
                alas = scanner.nextInt();
                tinggi = scanner.nextInt();
                int luasSegitiga = (alas*tinggi)/2;
                int sisiMiring = (int) Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
                int kelilingSegitiga = (alas+tinggi+sisiMiring);
                System.out.println(luasSegitiga + " " + kelilingSegitiga);
                break;

            case "lingkaran":
                diameter = scanner.nextInt();
                double luasLingkaran = (phi * diameter * diameter)/4;
                double kelilingLingkaran = phi * diameter;
                System.out.println(luasLingkaran + " " + kelilingLingkaran);
        }
    }
}
