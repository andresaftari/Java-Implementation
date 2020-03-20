package DataStructure.bakery;

import java.util.LinkedList;
import java.util.Queue;

public class AntrianRoti {
    Queue<BreadItem> antrian;
    private int count;

    public AntrianRoti() {
        antrian = new LinkedList<>(); // (1)
    }

    public void ambilNomor(int no, String nama, String jenis, int jumlah) {
        BreadItem item = new BreadItem(no, nama, jenis, jumlah);
        antrian.add(new BreadItem(no, nama, jenis, jumlah)); // (2)

        if (count > 0) // (3)
            System.out.println("Anda menunggu " + count + " orang lagi");

        count++; // (4)
    }

    public BreadItem panggilan() {
        count--;
        // BreadItem breadItem = antrian.poll(); (5)
        // Saya ubah menjadi inline code agar lebih efisien :)
        return antrian.poll();
    }

    public void panggilanRoti() {
        BreadItem bread = panggilan();
        System.out.println("Nomor " + bread.getNomorAntre() + " : "
                + "\nuntuk pembelian " + bread.getNama() + " sudah siap"); // (6)
    }

    public void hapusAntrian() {
        antrian.clear(); // (7)
    }
}
