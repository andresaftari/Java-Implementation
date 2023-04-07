package RealCase.TypeA1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private final Queue<PelangganEs> queue = new LinkedList<>();

    public static void main(String[] args) {
        Main tungguEs = new Main();

        tungguEs.ambilNomor(new PelangganEs(1, "Rita", "Es krim vanilla", 10));
        tungguEs.ambilNomor(new PelangganEs(2, "Adi", "Boba gula aren", 5));
        tungguEs.ambilNomor(new PelangganEs(3, "Ika", "Es krim vanilla double", 4));

        tungguEs.panggilanEs();

        tungguEs.ambilNomor(new PelangganEs(4, "Fikri", "Boba es sedikit", 2));
    }

    private void ambilNomor(PelangganEs pelanggan) {
        queue.add(pelanggan);

        if (queue.size() > 0) {
            // Counting bisa langsung dari jumlah queue tapi dikurangin first data (jadi -1)
            int count = queue.size() - 1;
            System.out.println("Anda menunggu " + count + " orang lagi");
        }
    }

    private void panggilanEs() {
        if (queue.isEmpty()) {
            System.out.println("Queue kosong!");
        } else {
            // Nomor dipanggil duluan, jadi peek() dulu untuk liat first data
            String nomor = queue.peek() != null ? queue.peek().getNama() : "";
            // Pesanan dipanggil setelah peek(), terus poll() untuk liat sekaligus hapus first data
            String pesanan = queue.peek() != null ? queue.poll().getNama() : "";

            System.out.println("Nomor " + nomor + " untuk pembelian " + pesanan + " sudah siap");
        }
    }
}
