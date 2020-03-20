import java.util.Scanner;

public class SmsDira {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String textMessage = scn.nextLine();
        //Pertama, digunakan String textMessage = scn.nextLine(); agar user dapat memasukkan sebuah Message/pesan SMS

        String newMessage = textMessage.replaceAll("[AIUEOaiueo]", "");
        /* Selanjutnya, digunakan String newMessage = textMessage untuk membuat input baru berdasarkan input dari user
        yang dimasukkan ke dalam String textMessage. */

        /* Pada operasi ini, ada method = textMessage.replaceAll, yang memang digunakan untuk mengubah String
        (huruf yg lebih dari satu) berupa String "AIUEOaiueo" menjadi String kosong/Empty String yang ditulis ("") */

        textDira(newMessage);
        //Mendeklarasikan (memanggil) newMessage yang ada dalam bentuk method textDira();
    }

    private static void textDira(String text) {
        System.out.println(text);
    }
}
