package RealCase.TypeA2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private final Queue<Pelanggan> queue = new LinkedList<>();

    public static void main(String[] args) {
        Main antriWarung = new Main();

        antriWarung.ambilNomor(new Pelanggan(1, "Rudi", "Bubur ayam biasa", 5));
        antriWarung.ambilNomor(new Pelanggan(2, "Sita", "Bubur ayam special", 8));
        antriWarung.ambilNomor(new Pelanggan(3, "Gerry", "Bubur ayam ati ampela", 2));

        antriWarung.panggil();

        antriWarung.ambilNomor(new Pelanggan(4, "Icha", "Bubur ayam biasa diaduk", 2));
    }

    private void ambilNomor(Pelanggan pelanggan) {
        queue.add(pelanggan);

        if (queue.size() > 0) {
            int count = queue.size() - 1;
            System.out.println("Terdapat " + count + " pesanan yang sedang diproses");
        }
    }

    private void panggil() {
        if (queue.isEmpty()) {
            System.out.println("Queue kosong!");
        } else {
            String nama = queue.peek() != null ? queue.peek().getNama() : "";
            String nomor = queue.peek() != null ? queue.peek().getNama() : "";
            String pesanan = queue.peek() != null ? queue.peek().getNama() : "";

            System.out.println("Nomor " + nomor + " - " + nama + ", " + pesanan + " siap diambil");
        }
    }
}
