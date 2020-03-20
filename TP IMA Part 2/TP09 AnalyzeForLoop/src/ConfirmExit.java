import java.util.Scanner;

public class ConfirmExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String jawab;
        boolean running = true;

        while (running) {
            System.out.println("Apakah Anda ingin memberhentikan program?");
            System.out.println("[YA][TIDAK]");

            jawab = sc.nextLine();

            if (jawab.equalsIgnoreCase("YA")) {
                running = false;
            }
            count++;
        }
        System.out.println("Perulangan yang dilakukan program : " + count);
    }
}
