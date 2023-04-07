package TP_IMA.TP_IMA_01.method_06;

import java.util.Scanner;

public class BangunDatarMethod {
    private static void persegi(int sisi) {
        int luasPersegi = sisi*sisi;
        int kelilingPersegi = 4*sisi;
        System.out.println(luasPersegi + " " + kelilingPersegi);
    }
    private static void persegiPanjang(int panjang, int lebar) {
        int luasPersegiPanjang = panjang*lebar;
        int kelilingPersegiPanjang = 2*(panjang + lebar);
        System.out.println(luasPersegiPanjang + " " + kelilingPersegiPanjang);
    }
    private static void segitiga(int alas, int tinggi) {
        int luasSegitiga = (alas*tinggi)/2;
        int sisiMiring = (int) Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi,2));
        int kelilingSegitiga = alas + tinggi + sisiMiring;
        System.out.println(luasSegitiga + " " + kelilingSegitiga);
    }
    private static void lingkaran(double diameter) {
        final double phi = 3.14;
        double luasLingkaran = (phi * diameter * diameter)/4;
        double kelilingLingkaran = phi*diameter;
        System.out.println(luasLingkaran + " " + kelilingLingkaran);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bangunDatar = input.nextLine();
        int sisi;
        int lebar;
        int panjang;
        double diameter;
        int alas;
        int tinggi;

        if(bangunDatar.equalsIgnoreCase("persegi")) {
            sisi = input.nextInt();
            persegi(sisi);
        } else if(bangunDatar.equalsIgnoreCase("persegipanjang")) {
            panjang = input.nextInt();
            lebar = input.nextInt();
            persegiPanjang(panjang, lebar);
        } else if(bangunDatar.equalsIgnoreCase("segitiga")) {
            alas = input.nextInt();
            tinggi = input.nextInt();
            segitiga(alas, tinggi);

        } else if(bangunDatar.equalsIgnoreCase("lingkaran")) {
            diameter = input.nextInt();
            lingkaran(diameter);
        }
    }
}
