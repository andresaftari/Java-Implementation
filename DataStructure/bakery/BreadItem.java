package DataStructure.bakery;

public class BreadItem {
    private int nomorAntre, jumlah;
    private String nama, jenis;

    public BreadItem(int nomorAntre, String nama, String jenis, int jumlah) {
        this.nomorAntre = nomorAntre;
        this.jumlah = jumlah;
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return " : ";
    }

    public String getNama() {
        return nama;
    }

    public int getNomorAntre() {
        return nomorAntre;
    }
}
