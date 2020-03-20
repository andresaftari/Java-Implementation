import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        passStrength(password);
    }

    private static void passStrength(String password) {
        int panjangPassword = password.length();
        System.out.println("Panjang password Anda : " + panjangPassword);

        if (panjangPassword >= 4 && panjangPassword <= 6) {
            System.out.println("Kekuatan password Anda : Lemah");
        }
        else if (panjangPassword >= 7 && panjangPassword <= 9) {
            System.out.println("Kekuatan password Anda : Sedang");
        }
        else if (panjangPassword >= 10 && panjangPassword <= 12) {
            System.out.println("Kekuatan password Anda : Kuat");
        }
        else if (panjangPassword >= 13) {
            System.out.println("Kekuatan password Anda : Sangat kuat");
        }
    }
}
