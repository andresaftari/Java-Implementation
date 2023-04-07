package com.andre.TP_IMA_01.method_05;

import java.util.Scanner;

public class OperasiPersamaanKuadrat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Agar program dapat menerima input dari user, digunakan Scanner scn = new Scanner(System.in);

        int inputA = scn.nextInt();
        int inputB = scn.nextInt();
        int inputC = scn.nextInt();
        //Digunakan tipe data int (integer) sehingga user hanya dapat menginput masukan dalam bentuk bilangan bulat

        hasilOperasi(inputA, inputB, inputC);
        //Mendeklarasikan
    }

    private static void hasilOperasi(int a, int b, int c) {
        //Pertama, membuat Determinant yang dinyatakan dalam rumus berupa --> D = b^2 - 4ac
        double determinant = (b * b) - (4 * a * c);

        //Lalu, membuat rumus pembagi yang ditulis dalam bentuk 2a
        int pembagi = (2 * a);

        /* Selanjutnya, untuk menentukan hasil dari operasi positif (x1), maka diperlukan rumus akar kuadrat positif
        yang ditulis dengan rumus : */
        double operasiPositif = (-b + Math.sqrt(determinant));
        double x1 = operasiPositif / pembagi;

        /* Selanjutnya, untuk menentukan hasil dari operasi negatif (x2), maka diperlukan rumus akar kuadrat negatif
        yang ditulis dengan rumus : */
        int operasiNegatif = (int) (-b - Math.sqrt(determinant));
        int x2 = operasiNegatif / pembagi;

        //Mencetak hasil dari x1 (operasi akar kuadrat positif) dan x2 (operasi akar kuadrat negatif)
        System.out.println(x1 + " " + x2);
    }
}
