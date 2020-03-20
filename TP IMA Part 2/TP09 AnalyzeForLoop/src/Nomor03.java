import java.util.Scanner;

public class Nomor03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kodeDNA1 = scanner.nextLine();
        String kodeDNA2 = scanner.nextLine();

        int beda = 0;
        for (int i = 0; i < kodeDNA1.length(); i++) {
            if (kodeDNA1.charAt(i) != kodeDNA2.charAt(i)) {
                beda++;
                break;
            }
        }
        if (beda == 0)
            System.out.println("DNA identik.");
        else
            System.out.println("DNA berbeda.");
    }
}
