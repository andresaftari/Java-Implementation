import java.util.Scanner;

public class Nomor02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int pembalik = 0;

        while (input > 0) {
            pembalik = pembalik * 10;
            pembalik = pembalik + input % 10;
            input = input / 10;
        }
        System.out.println(pembalik);
    }
}
