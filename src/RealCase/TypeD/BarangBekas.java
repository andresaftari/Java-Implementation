package RealCase.TypeD;

public class BarangBekas {
    private int id, berat;
    private String namaPengumpul;

    public BarangBekas(int id, String namaPengumpul, int berat) {
        this.id = id;
        this.namaPengumpul = namaPengumpul;
        this.berat = berat;
    }

    public String getNamaPengumpul() {
        return namaPengumpul;
    }

    public int getBerat() {
        return berat;
    }

    @Override
    public String toString() {
        return "Data pengumpul { id: " + id + " | nama pengumpul: " + namaPengumpul + " | berat: " + berat;
    }
}
