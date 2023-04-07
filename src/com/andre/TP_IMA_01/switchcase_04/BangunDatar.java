package com.andre.TP_IMA_01.switchcase_04;

import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        final double phi = 3.14;
        Scanner scanner = new Scanner(System.in);

        String bangunDatar = scanner.nextLine();
        int sisi;
        int panjang;
        int lebar;
        int alas;
        int tinggi;
        int diameter;

        switch (bangunDatar) {
            case "Persegi" :
                sisi = scanner.nextInt();
                int luasPersegi = sisi * sisi;
                int kelilingPersegi = 4 * sisi;
                System.out.println(luasPersegi + " " + kelilingPersegi);
                break;

            case "Persegi Panjang" :
                panjang = scanner.nextInt();
                lebar = scanner.nextInt();
                int luasPersegiPanjang = panjang * lebar;
                int kelilingPersegiPanjang = (2 * panjang) + (2 * lebar);
                System.out.println(luasPersegiPanjang + " " + kelilingPersegiPanjang);
                break;

            case "Segitiga Siku-Siku" :
                alas = scanner.nextInt();
                tinggi = scanner.nextInt();
                int luasSegitigaSikuSiku = (alas * tinggi) /2;
                int sisiMiring = (int) Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
                int kelilingSegitigaSikuSiku = (alas + tinggi + sisiMiring);
                System.out.println(luasSegitigaSikuSiku + " " + kelilingSegitigaSikuSiku);
                break;

            case "Lingkaran" :
                diameter = scanner.nextInt();
                double luasLingkaran = (phi * diameter * diameter) /4;
                double kelilingLingkaran = 3.14 * diameter;
                System.out.println(luasLingkaran + " " + kelilingLingkaran);
                break;
        }
    }
}
