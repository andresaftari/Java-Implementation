package DataStructure.laundry;

public class Pakaian implements Comparable<Pakaian> {
    int waktuSelesai, id, berat;
    String nama;

    public Pakaian(int waktuSelesai, int id, String nama, int berat ) {
        this.waktuSelesai = waktuSelesai;
        this.id = id;
        this.nama = nama;
        this.berat = berat;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Pakaian atas nama " + getNama() + " dengan ID = " + getId();
    }

    @Override
    public int compareTo(Pakaian o) {
        if (waktuSelesai > o.waktuSelesai) {
            return 1;
        } else {
            return -1;
        }
    }
}
