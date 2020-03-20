package DataStructure.laundry;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Cucian {
    private PriorityQueue<Pakaian> listCucian;

    public Cucian() {
        listCucian = new PriorityQueue<>(); // (1)
    }

    public void terimaCucian(int id, String nama, int tanggal, String jenis, int berat) {
        int waktuSelesai;
        Pakaian pesanan;

        if (jenis.toLowerCase().equals("biasa")) {
            waktuSelesai = tanggal + 3;
        } else if (jenis.toLowerCase().equals("express")) {     //(2)
            waktuSelesai = tanggal + 2; // (3)
        } else
            waktuSelesai = tanggal + 1;

        pesanan = new Pakaian(waktuSelesai, id, nama, berat);

        listCucian.add(pesanan);  // (4)
    }

    public void cetakDataCucian() {
        Iterator<Pakaian> iterator = listCucian.iterator();  // (5)
        System.out.println("Urutan cucian harus diselesaikan:");

        while (iterator.hasNext()) {   // (6)
            Pakaian cucian = iterator.next(); // (7)
            System.out.println(cucian);
        }
    }
}
