import java.util.Scanner;

public class TugasMalam {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String tujuan = scn.nextLine();
        int penumpang = scn.nextInt();
        int harga = 0;

        switch (tujuan) {
            case "Jakarta":
                harga = 145000;
                break;
            case "Bogor":
                harga = 200000;
                break;
            case "Garut":
            case "Purwakarta":
                harga = 75000;
                break;
        }
        int total = harga * penumpang;
        if (total > 250000 && tujuan.equals("Bogor")) {
            int diskon = (total * 10)/100;
            total = total - diskon;
        }
        System.out.println(total);
    }
}
