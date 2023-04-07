package TP_IMA.TP_IMA_01.pra_ass_07.soal02;

import java.util.Scanner;

public class TP07_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kodeAcara = scanner.nextLine();

        switch (kodeAcara) {
            case "Kelas":
                System.out.println("Rapat kelompok tugas");
                System.out.println("15 Oktober 2019");
                break;
            case "KM":
                System.out.println("Rapat ketua kelas");
                System.out.println("17 Oktober 2019");
                break;
            case "Lomba":
                System.out.println("Rapat anggota lomba");
                System.out.println("23 Oktober 2019");
                break;
            case "IMA":
                System.out.println("Pengerjaan Tugas Mandiri IMA");
                System.out.println("26 Oktober 2019");
                break;
            case "PDW":
                System.out.println("Pengerjaan Tugas Besar PDW");
                System.out.println("30 Oktober 2019");
                break;
        }
    }
}
