package TP_IMA.TP_IMA_01.method_06;

import java.util.Scanner;

public class KonversiSuhu {
    private static void rumusKonversi(Double fahrenheit) {
        double celcius = (fahrenheit -32) * 5/9;
        System.out.println(celcius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suhu1 = input.nextDouble();
        double suhu2 = input.nextDouble();
        double suhu3 = input.nextDouble();

        rumusKonversi(suhu1);
        rumusKonversi(suhu2);
        rumusKonversi(suhu3);
    }
}
