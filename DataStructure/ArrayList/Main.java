package ArrayList;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Data> list = new ArrayList<>();
        int nomorTelp, select;
        String nama, alamat;
        do {
            System.out.println("1. Input\n2. Lihat\n3. Delete data\n4. Exit");
            select = Integer.parseInt(br.readLine());
            switch (select) {
                case 1:
                    System.out.println("Input data mantan : ");
                    System.out.print("Nomor telp : ");
                    nomorTelp = Integer.parseInt(br.readLine());
                    System.out.print("Nama mantan : ");
                    nama = br.readLine();
                    System.out.print("Alamat mantan : ");
                    alamat = br.readLine();

                    list.add(new Data(nomorTelp, nama, alamat));
                    break;

                case 2:
                    for (Data mantan : list)
                        System.out.println(mantan);
                    break;

                case 3:
                    System.out.print("Cari nama mantan yg mau di-delete datanya : ");
                    String cariNama = br.readLine();
                    int index = list.size() - 1;

                    if (index == 0)
                        System.out.println(list.get(index).getNamaMantan());
                    else if (index > 0) {
                        for (Data mantan : list) {
                            if (cariNama.equalsIgnoreCase(list.get(index).getNamaMantan())) {
                                index--;
                                System.out.println(mantan.toString());
                            }
                        }
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }
        while (true);
    }
}
