import java.util.Scanner;

public class Latihan {
    private static int tambah(int angka1, int angka2) {
        return angka1 + angka2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        System.out.println(tambah(angka2, angka1));
    }
 }