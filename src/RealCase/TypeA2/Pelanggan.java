package RealCase.TypeA2;

public class Pelanggan {
    private int nomor, jumlah;
    private String nama, pesanan;

    public Pelanggan(int nomor, String nama, String pesanan, int jumlah) {
        this.nomor = nomor;
        this.jumlah = jumlah;
        this.nama = nama;
        this.pesanan = pesanan;
    }

    public int getNomor() {
        return nomor;
    }

    public String getPesanan() {
        return pesanan;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Pelanggan {" + nomor + " - " + nama + " | pesanan: " + pesanan + " | jumlah: " + jumlah;
    }
}
