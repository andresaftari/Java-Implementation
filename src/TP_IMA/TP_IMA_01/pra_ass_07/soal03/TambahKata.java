package TP_IMA.TP_IMA_01.pra_ass_07.soal03;

import java.util.Scanner;

public class TambahKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pernyataan = scanner.nextLine();

        String concat = "NI";
        concat = concat.concat(pernyataan);

        System.out.println(concat);
    }
}
