package DataStructure.laundry;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Cucian {
    private PriorityQueue<Pakaian> listCucian;
    // Pada kali ini, kita gunakan PriorityQueue, yaitu Queue yang sifatnya semi-sorting, karena PriorityQueue akan
    // melakukan eksekusi terlebih dahulu terhadap element yang prioritasnya lebih tinggi dibandingkan element lain,
    // walaupun bentuknya memang seperti Queue, namun sedikit berbeda daripada original Queue

    public Cucian() {
        listCucian = new PriorityQueue<>(); // (1)
    }

    // Pada method ini, method terimaCucian(), fungsinya adalah menambahkan antrian cucian baru ke dalam PriorityQueue<>
    // listCucian yang sudah kita sediakan
    public void terimaCucian(int id, String nama, int tanggal, String jenis, int berat) {
        int waktuSelesai;
        Pakaian pesanan;

        // Setelah kita lakukan komparasi menggunakan Comparable di Object class Pakaian, kita pisahkan prioritas cucian
        // menjadi 3 jenis
        if (jenis.toLowerCase().equals("biasa")) {
            waktuSelesai = tanggal + 3;
            // Penjabaran jenis cucian Biasa
        } else if (jenis.toLowerCase().equals("express")) {     //(2)
            waktuSelesai = tanggal + 2; // (3)
            // Penjabaran jenis cucian Express
        } else
            waktuSelesai = tanggal + 1;
            // Penjabaran jenis cucian lainnya

        pesanan = new Pakaian(waktuSelesai, id, nama, berat);
        // Kita inisiasikan dalam bentuk variable "pesanan", apa saja yang ingin kita add ke PriorityQueue kita
        listCucian.add(pesanan);  // (4)
        // Untuk menambahkan object ke dalam struktur data PriorityQueue, dapat kita gunakan List method yaitu List.add()
    }

    // Mencetak data tentang pelanggan dan cucian yang sekarang sedang dikerjakan, lalu terus berpindah list node
    // setelah cucian pertama telah selesai
    public void cetakDataCucian() {
        Iterator<Pakaian> iterator = listCucian.iterator();  // (5)
        // Untuk memulai perhitungan iterasi, kita gunakan Iterator untuk automatic Iteration, sehingga saat data cucian
        // di method ini kita cetak, maka iterasi mengalami perpindahan ke List Node sebelahnya
        System.out.println("Urutan cucian harus diselesaikan:");

        while (iterator.hasNext()) {   // (6)
            Pakaian cucian = iterator.next(); // (7)
            // Setelah mengerjakan iterasi 1, maka iterator akan berpindah ke List Node selanjutnya
            System.out.println(cucian);
            // Mencetak data cucian
        }
    }
}
