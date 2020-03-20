import java.util.Scanner;

public class Nomor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int banyakAmoeba = scanner.nextInt();
        int minute = 0;

        while (banyakAmoeba > 30) {
            //Apabila banyakAmoeba yang diinput lebih dari 30, maka program menjalankan loop berikut :

            banyakAmoeba *= 0.5;
            //banyakAmoeba dikalikan dengan 0.5 karena merupakan 1/2 dari sel induknya (tidak perlu dipikirkan, ini biologi)
            minute += 15;
            //waktu ditambah 15 menit
        }
        System.out.println(minute);
    }
}
