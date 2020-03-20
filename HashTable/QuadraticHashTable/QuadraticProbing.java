package JawabanSoalTeori.QuadraticHashTable;

import java.util.Arrays;

public class QuadraticProbing {
    int arraySize;
    String[] theArray;

    public static void main(String[] args) {
        QuadraticProbing function = new QuadraticProbing(13);

        String[] elementToAdd = {"3", "27", "41", "13", "4", "51", "9", "45", "23", "7", "8"};

        function.DoubledHashFunction(elementToAdd, function.theArray);
        function.displayTheStack();
    }

    void DoubledHashFunction(String[] stringsForArray, String[] theArray) {
        for (int i = 0; i < stringsForArray.length; i++) {
            // Simpan value dalam array index dan siapkan quadratic i
            String newElementValue = stringsForArray[i];
            int quadratic = i * i;

            // Buatkan index untuk menyimpan value dengan modulus
            int arrayIndex = ((Integer.parseInt(newElementValue) + quadratic) * 3) % 13;
            System.out.println("Modulus index " + arrayIndex + " untuk value " + newElementValue);

            // Cycle sampai ditemukan empty spaces
            while (!theArray[arrayIndex].equals("-1")) {
                ++arrayIndex;

                System.out.println("Collision try! " + arrayIndex + " instead");

                // Apabila cycle telah sampai ujung array, cycle back dari 0
                arrayIndex %= arraySize;
            }
            theArray[arrayIndex] = newElementValue;
        }
    }

    QuadraticProbing(int size) {
        arraySize = size;
        theArray = new String[size];

        // Isi empty space dengan negative
        fillArrayWithNegative();
    }

    void fillArrayWithNegative() {
        Arrays.fill(theArray, "-1");
    }

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
