package RealCase.TypeA1;

public class PelangganEs {
    private int nomor, jumlah;
    private String nama, pesanan;

    public PelangganEs(int nomor, String nama, String pesanan, int jumlah) {
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
