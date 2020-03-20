import java.util.Scanner;

public class Nomor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int faktor = 1;

        for (int i = 1; i <= input / 2; i++) {
            if (input % i == 0) {
                faktor++;
            }
        }
        System.out.println(faktor);
    }
}
