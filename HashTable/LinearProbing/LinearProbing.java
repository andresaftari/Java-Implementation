package JawabanSoalTeori.LinearProbing;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProbing {
    String[] theArray;
    int arraySize;

    public static void main(String[] args) {
        LinearProbing theFunction = new LinearProbing(13); // Memanggil Class utama dengan nama the Function
        Scanner scanner = new Scanner(System.in);

        String[] elementToAdd = {"3", "27", "41", "13", "4", "51", "9", "45", "23", "7", "8"};

        theFunction.hashFunction(elementToAdd, theFunction.theArray);
        theFunction.displayTheStack();
    }

    // Cara kerja fungsi HashTable Java
    // Misalkan kita memiliki nilai antara 0 dan 999, tetapi jumlah nilai ini kita pilih lagi sehingga jumlah antara 0 sampai 999
    // hanya 15 value saja. Satu cara sehingga angka-angka ini masuk ke dalam 30 item array adalah menggunakan "Modulus".
    // Ambil modulus dari suatu value tersebut, versus array 30 item tersebut. Bingung? Baca kodingan di bawah :
    public void hashFunction(String[] stringsForArray, String[] array) {
        // Melakukan loop dari 0 sampai array.length, lalu menyimpan newElementValue ke dalam index stringsForArray[i]
        for (String newElementValue : stringsForArray) {
            // Membuat arrayIndex untuk menyimpan value dengan mengambil modulus 29 dari integer newElementValue
            int arrayIndex = (Integer.parseInt(newElementValue) * 3) % 13;
            System.out.println("Modulus Index = " + arrayIndex + " for value " + newElementValue);

            // Lakukan cycle/routine untuk mencari kotak kosong (empty space)
            while (!array[arrayIndex].equals("-1")) {
                ++arrayIndex;
                System.out.println("Collision Try! " + arrayIndex + " Instead");
                // Apabila tidak ditemukan sampai ujung array, ulang lagi dari index 0
                arrayIndex %= arraySize;
            }
            array[arrayIndex] = newElementValue;
        }
    }
    LinearProbing(int size) {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1"); // -1 untuk index head-start, biar kita tau kotak yang mana yang kosong (empty space)
    }

    // Cuma biar ada tabelnya aja kok, gausah dipikirin, gausah dibaca, gapenting :)
    public void displayTheStack() {
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
                else if (theArray[n].equals("-1"))
                    System.out.print("|      ");
                else
                    System.out.print(String.format("| %3s " + " ", theArray[n]));
            }
            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
        }
    }
}
