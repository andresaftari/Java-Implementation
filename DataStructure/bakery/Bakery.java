package DataStructure.bakery;

public class Bakery {
    public static void main(String[] args) {
        AntrianRoti antrianRoti = new AntrianRoti();
        // Tidak perlu memanggil BreadItem karena sudah menggunakan antreanRoti
        // BreadItem item;

        antrianRoti.ambilNomor(1,"Roti Upin","roti manis",10);
        antrianRoti.ambilNomor(2,"Roti Ipin","roti manis",5);
        antrianRoti.ambilNomor(3,"Roti Ismail","roti manis",4);

        antrianRoti.panggilanRoti();
        antrianRoti.ambilNomor(4,"Roti Santi","roti manis",2);
    }
}