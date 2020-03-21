import java.util.LinkedList;

// Algoritma Separate Chaining untuk menghindari Collision apabila terjadi beberapa value yang index nya sama
public class SeparatewithCollision {
    private static String[] theArray = new String[13];
    // Inisialisasi terhadap Array utama dengan size sebesar 13 yang akan digunakan untuk menampung index

    public static void main(String[] args) {
        SeparatewithCollision function = new SeparatewithCollision();
        LinkedList<String> elementContainer = new LinkedList<>();
        // Karena Separate Chaining mengimplementasikan Linked chain apabila terjadi collision, maka kita buatkan
        // LinkedList yang akan menampung apabila terjadi chaining karena value yang berbeda berada di satu index sama
        String[] elementToAdd = {"3", "27", "41", "13", "6", "51", "9", "45", "21", "14", "8"};
        // Masukkan value-value yang akan kita gunakan ke dalam Array kedua yang dibuat khusus untuk elements

        for (String newElementValue : elementToAdd) {
            // Lakukan looping terhadap seluruh value dalam Array element, dan tampung masing-masing value ke dalam
            // bentuk variable baru, yaitu newElementValue
            int arrayIndex = (Integer.parseInt(newElementValue) * 3) % 13;
            // Untuk menentukan index, gunakan syarat yang ada di soal, yaitu newElement (x3) modulus 13
            if (theArray[arrayIndex] != null) {
                elementContainer.add(theArray[arrayIndex]);
                // Apabila arrayIndex ke-n sesuai adalah index ke-n yang kosong pada Array utama, maka masukkan Array
                // utama dengan arrayIndex ke-n tersebut ke dalam LinkedList dengan method List.add()
            }

            elementContainer.add(newElementValue);
            // Selanjutnya setelah keluar dari if, tambahkan juga newValue ke dalam LinkedList dengan method list.add()
            String element = elementContainer.toString();
            // Karena dalam LinkedList kita ini adalah Integer, ubahlah ke String dengan method toString()
            element = element.replaceAll("\\[", "").replaceAll("]", "")
                    .replaceAll(",", "");
            // Apabila ada element yang Collision, tidak perlu diberikan tanda apa-apa

            theArray[arrayIndex] = element;
            // Lalu deskripsikan bahwa Array utama dengan index ke-arrayIndex berisi element collision
            elementContainer.clear();
            // Kalau sudah tidak ada collision, hapus LinkedList
        }

        int index = 0;
        for (String result : theArray) {
            System.out.println("Index " + index + " for value " + result);
            // Lakukan foreach loop untuk Looping ke Array utama dan mencetak semua element sesuai indexnya
            index++;
            // Berikan increment pada index agar sesuai dengan urutan elementnya
        }
        System.out.println();
        function.displayTheStack();
        // Tampilkan dalam bentuk table
    }

    // Cuma biar ada tabelnya aja kok, gausah dipikirin, gausah dibaca, gapenting :)
    public void displayTheStack() {
        int arraySize = theArray.length;
        int increment = 0;
        int numberOfRows = (arraySize / 10) + 1;

        for (int m = 0; m < numberOfRows; m++) {
            increment += 10;

            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();

            for (int n = increment - 10; n < increment; n++)
                System.out.format("| %3s " + " ", n);
            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();

            for (int n = increment - 10; n < increment; n++) {
                if (n >= arraySize)
                    System.out.print("|      ");
                else if (theArray[n] == null)
                    System.out.print("|      ");
                else
                    System.out.print(String.format(" |%3s" + " ", " " + theArray[n]));
            }
            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
        }
    }
}
