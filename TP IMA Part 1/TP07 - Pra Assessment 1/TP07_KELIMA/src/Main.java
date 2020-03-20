import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hariSekian = scanner.nextInt();
        hariSekian %= 7;
        System.out.println(namaHari(hariSekian));;
    }
    private static int namaHari(int hariSekian) {
        switch (hariSekian) {
            case 0:
                System.out.println("Sabtu");
                break;
            case 1:
                System.out.println("Minggu");
                break;
            case 2:
                System.out.println("Senin");
                break;
            case 3:
                System.out.println("Selasa");
                break;
            case 4:
                System.out.println("Rabu");
                break;
            case 5:
                System.out.println("Kamis");
                break;
            case 6:
                System.out.println("Jumat");
                break;
        }
        return hariSekian;
    }
}
