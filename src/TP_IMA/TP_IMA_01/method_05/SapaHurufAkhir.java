package TP_IMA.TP_IMA_01.method_05;

import java.util.Scanner;

public class SapaHurufAkhir {
    private static void sapa(String nama) {
            /* Pada soal ini, program meminta huruf terakhir dari sebuah nama, maka dapat digunakan sebuah String Method
            berupa namaMethod.endsWith(); dimana .endsWith() diisi dengan String yang akan dijadikan patokan akhir  */

        if (nama.endsWith("i")) {
            //untuk nama dengan akhiran "i", maka digunakan method .endsWith("i");
            System.out.println("Halo, " + nama + ". Semangat pagi!");
        }
        else if (nama.endsWith("r")) {
            //untuk nama dengan akhiran "r", maka digunakan method .endsWith("r");
            System.out.println("Halo, " + nama + ". Semangat pintar!");
        }
        else {
            //untuk nama dengan akhiran selain "i" dan "r", maka method .endsWith(); tidak digunakan di masalah ini
            System.out.println("Halo, " + nama + ". Semangat yaaa!");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //code Scanner scn = new Scanner(System.in); digunakan untuk membuat program dapat menerima masukkan dari user

        String namaOrangPertama = scn.nextLine();
        String namaOrangKedua = scn.nextLine();
        String namaOrangKetiga = scn.nextLine();
        //Tipe data String digunakan untuk menginput masukan dari user berupa kalimat (yaitu nama orang)

        sapa(namaOrangPertama);
        sapa(namaOrangKedua);
        sapa(namaOrangKetiga);
        /* namaMethod(variable); adalah cara memanggil/mendeklarasikan method yang digunakan sesuai banyaknya parameter
        yang digunakan dalam private method declaration */
    }
}
