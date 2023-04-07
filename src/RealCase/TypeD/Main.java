package RealCase.TypeD;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private final static LinkedList<BarangBekas> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int id = 1; // Kalau mau buat id nya automatis (auto increment) bisa coba ini

        do {
            // Untuk Java di atas versi 12 bisa print begini, untuk Java versi di bawah 12, manual pakai \n aja
            System.out.println("""
                    Pilihan:
                    1. Input barang
                    2. Lihat total barang
                    3. Cari barang berdasarkan nama pengumpul
                    4. Exit""");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nInput nama [nama panggilan]: ");
                    String nama = sc.next();
                    System.out.println("Input berat [1-100]: ");
                    int berat = sc.nextInt();

                    inputBarang(new BarangBekas(id, nama, berat));
                    id++; // Kalau mau buat id nya automatis (auto increment) bisa coba ini
                    break;

                case 2:
                    System.out.println("\nTotal barang saat ini: " + list.size() +
                            "\nTotal berat keseluruhan: " + totalBerat());
                    break;

                case 3:
                    System.out.println("\nInput nama pengumpul yang mau dicari [nama panggilan]: ");
                    String cariNama = sc.next();

                    searchBarang(cariNama);
                    break;

                case 4:
                    System.out.println("Bye!");
                    System.exit(0);
            }
        } while (true);
    }

    private static void inputBarang(BarangBekas barangBekas) {
        list.add(barangBekas);
    }

    private static void searchBarang(String nama) {
        // ================ Versi for loop (Pilih aja mau yang mana) ================
        for (BarangBekas barangBekas : list) {
            if (barangBekas.getNamaPengumpul().equalsIgnoreCase(nama)) {
                System.out.println(barangBekas);
            }
        }

        // ================ Versi iterator (Pilih aja mau yang mana) ================
        // ListIterator<BarangBekas> iterator = list.listIterator();

        // while (iterator.hasNext()) {
        //     BarangBekas barangBekas = iterator.next();

        //     if (barangBekas.getNamaPengumpul().equalsIgnoreCase(nama)) {
        //         System.out.println(barangBekas);
        //     }
        // }
    }

    private static int totalBerat() {
        int result = 0;

        for (BarangBekas barangBekas : list) result += barangBekas.getBerat();
        return result;
    }
}
