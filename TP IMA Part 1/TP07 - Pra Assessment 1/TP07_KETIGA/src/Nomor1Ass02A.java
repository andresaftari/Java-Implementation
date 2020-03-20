import java.util.Scanner;

public class Nomor1Ass02A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 1; i <= testCase; i++) {
            int  n = sc.nextInt(); //Awal lampu mati semua A & B
            int possibility = n % 4;

            switch (possibility) {
                case 1:
                    System.out.println("HIDUP MATI"); //Kalau 1 kali tekan saklar, lampu A nyala
                    break;
                case 2:
                    System.out.println("HIDUP HIDUP"); //2 kali maka lampu A B nyala
                    break;
                case 3:
                    System.out.println("MATI HIDUP"); //3 kali lampu A mati
                    break;
                default:
                    System.out.println("MATI MATI"); //4 kali kali lampu A B mati
            }
        }
    }
}
