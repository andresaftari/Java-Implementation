import java.util.Scanner;

public class Nomor02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input / 2; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(input);
    }
}
