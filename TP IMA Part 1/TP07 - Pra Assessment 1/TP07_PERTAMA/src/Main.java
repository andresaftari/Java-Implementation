import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int hargaProdukDigital = 150000;
        Scanner scanner = new Scanner(System.in);

        int jumlahProdukDigital = scanner.nextInt();
        int diskonProduk;
        int hargaProduk;
        int totalPembayaran;

        hargaProduk = jumlahProdukDigital * hargaProdukDigital;
        System.out.println("Produk sebanyak " + jumlahProdukDigital + " x Rp" + hargaProdukDigital + " = Rp" + hargaProduk);

        if (hargaProduk >= 450000 && hargaProduk <= 600000) {
            diskonProduk = (hargaProduk * 20) / 100;
            System.out.println("Diskon produk 20%" + " = Rp" + diskonProduk);
        } else if (hargaProduk > 600000) {
            diskonProduk = (hargaProduk * 30) / 100;
            System.out.println("Diskon produk 30%" + " = Rp" + diskonProduk);
        } else {
            diskonProduk = 0;
        }
        totalPembayaran = hargaProduk - diskonProduk;
        System.out.println("Harga akhir produk digital = Rp" + totalPembayaran);
    }
}
