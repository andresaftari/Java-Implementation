package DataStructure.ArrayList;

public class Data {
    private int nomorTelp;
    private String namaMantan, alamatMantan;

    Data(int nomorTelp, String namaMantan, String alamatMantan) {
        this.nomorTelp = nomorTelp;
        this.namaMantan = namaMantan;
        this.alamatMantan = alamatMantan;
    }

    public String getNamaMantan() {
        return namaMantan;
    }

    public int getNomorTelp() {
        return nomorTelp;
    }

    public String getAlamatMantan() {
        return alamatMantan;
    }

    @Override
    public String toString() {
        return "Nama mantan : " + getNamaMantan() + " || " +
                "alamat mantan : " + getAlamatMantan() + " || " +
                "nomor telpon : " + getNomorTelp();
    }
}
