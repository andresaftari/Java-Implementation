package DataStructure.laundry;

// Kita perlu membuat Plain Old Java Object (POJO) sebagai Generic class yang membawa data object dari element-element
// yang akan kita gunakan
public class Pakaian implements Comparable<Pakaian> {
    // Pada kali ini, kita implementasikan Interface Comparable untuk melakukan komparasi antara satu element dari
    // object kita dengan element object lain yang sama
    int waktuSelesai, id, berat;
    String nama;

    // Buatkan Constructor untuk menyimpan parameter yang akan digunakan sebagai method untuk menyimpan nilai
    public Pakaian(int waktuSelesai, int id, String nama, int berat ) {
        this.waktuSelesai = waktuSelesai;
        this.id = id;
        this.nama = nama;
        this.berat = berat;
    }
    // Buatkan toString() method sebagai kalimat yang akan keluar saat object kita lakukan pemanggilan (kata-katanya
    // bebas, tidak harus sama)

    @Override
    public String toString() {
        return "Pakaian atas nama " + getNama() + " dengan ID = " + getId();
    }

    @Override
    public int compareTo(Pakaian o) {
        if (waktuSelesai > o.waktuSelesai) {
            // Kita gunakan comparable ini untuk melakukan sorting waktu pencucian
            return 1;
        } else {
            return -1;
        }
    }

    // Buatkan Getter sebagai alat yang akan kita gunakan saat memanggil element ini
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }
}
